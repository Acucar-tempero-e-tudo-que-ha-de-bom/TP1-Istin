package istin;

import istin.generic.GerenciadorJson;
import istin.exceptions.InvalidUserException;
<<<<<<< HEAD
=======
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
>>>>>>> origin/main
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
import org.json.JSONObject;
=======
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
>>>>>>> origin/main


public class Login extends GerenciadorJson<Usuario> {
    private static Login instance;
    private Usuario logado;
    
    public Login() {
        super("logins.json");
    }
    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public void criaNovaConta(Usuario autor) {
        jsonTratado.add(autor);
        salvarJson();
    }
    
    public boolean existeContaNome(String nomeInserido) {
        return jsonTratado.stream().anyMatch(u -> u.getNome().equals(nomeInserido));
    }
    
    public boolean existeContaEmail(String emailInserido) {
        return jsonTratado.stream().anyMatch(u -> u.getEmail().equals(emailInserido));
    }
    
    public void validaLogin(String nomeInserido, String senhaInserida) throws InvalidUserException {
        Optional<Usuario> optionalUsuario = jsonTratado.stream().filter(u -> (u.getNome().equals(nomeInserido) && u.getSenha().equals(senhaInserida))).findFirst();
        
        if (optionalUsuario.isEmpty()){
            throw new InvalidUserException("Esse usuário não existe");
        } else {
            this.setUsuarioLogado(optionalUsuario.get());
        }
    }
    
    // Setters and Getters
    public void setUsuarioLogado(Usuario logado) {
        this.logado = logado;
    }
    
    public Usuario getUsuarioLogado() {
        return logado;
    }

    // Class overrides
    @Override
    protected Usuario carregarObjeto(JSONObject json) {
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
    }

}
