package istin;

import istin.exceptions.InvalidUserException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Login implements GerenciadorJson{
    private static Login instance;
    private List<Usuario> logins;
    private Usuario logado;
    
    public Login() {
        carregaJson();
    }
    
    @Override
    public final void carregaJson() {
         try {
            FileInputStream is = new FileInputStream("logins.json");
            JSONTokener tokener = new JSONTokener(is);
            
            JSONArray loginsJson = new JSONArray(tokener);
            logins = IntStream.range(0, loginsJson.length()).mapToObj(i -> {
                JSONObject json = loginsJson.getJSONObject(i);
                switch (json.getString("tipo")) {
                    case "Cliente" -> {
                        return new Cliente(json);
                    }
                    case "Autor" -> {
                        return new Autor(json);
                    }
                    default -> Logger.getLogger(Login.class.getName()).log(Level.WARNING, "Tipo de usuario invalido");
                }
                return new Usuario(json);
            }).collect(Collectors.toList());
        } catch(FileNotFoundException e) {
            logins = new ArrayList<>();
        } catch(JSONException e) {
            logins = new ArrayList<>();
            salvarJson(); // Salva o JSON vazio
        }
    }
    
    @Override
    public void salvarJson() {
        try (FileWriter escreve = new FileWriter("logins.json")) {
            JSONArray loginsJson = new JSONArray(logins.stream().map(Usuario::toJSON).collect(Collectors.toList()));
            escreve.write(loginsJson.toString(4));
        } catch(IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void criaNovaConta(Usuario autor) {
        logins.add(autor);
        this.salvarJson();
    }
    
    public boolean existeContaNome(String nomeInserido) {
        Optional<Usuario> optionalUsuario = logins.stream().filter(u -> u.getNome().equals(nomeInserido)).findFirst();
        return optionalUsuario.isPresent();
    }
    
    public boolean existeContaEmail(String emailInserido) {
        Optional<Usuario> optionalUsuario = logins.stream().filter(u -> u.getEmail().equals(emailInserido)).findFirst();
        return optionalUsuario.isPresent();
    }
    
    public void validaLogin(String nomeInserido, String senhaInserida) throws InvalidUserException {
        Optional<Usuario> optionalUsuario = logins.stream().filter(u -> (u.getNome().equals(nomeInserido) && u.getSenha().equals(senhaInserida))).findFirst();
        
        if (optionalUsuario.isEmpty()){
            throw new InvalidUserException("Esse usuário não existe");
        } else {
            logado = optionalUsuario.get();
        }
    }
    
    public Usuario getUsuarioLogado() {
        return logado;
    }
    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }


}
