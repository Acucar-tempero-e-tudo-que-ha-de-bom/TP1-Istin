package istin;

import istin.exceptions.InvalidUserException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Login implements GerenciadorJson{
    private static Login instance;
    private JSONArray logins;
    private Usuario logado;
    
    public Login() {
        carregaJson();
    }
    
    @Override
    public void carregaJson() {
         try {
            FileInputStream is = new FileInputStream("logins.json");
            JSONTokener tokener = new JSONTokener(is);
            logins = new JSONArray(tokener);
        } catch(FileNotFoundException e) {
            logins = new JSONArray();
        }
    }
    
    @Override
    public void salvarJson() {
        try {
            FileWriter escreve = new FileWriter("logins.json");
            escreve.write(logins.toString(4));
            escreve.close();
        } catch(IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void criaNovaConta(Cliente cliente) {
        HashMap informacoesCliente = new HashMap();
        informacoesCliente.put("nome", cliente.getNome());
        informacoesCliente.put("email", cliente.getEmail());
        informacoesCliente.put("senha", cliente.getSenha());
        informacoesCliente.put("saldo", cliente.getSaldo());
        informacoesCliente.put("imagem", new String(Base64.getEncoder().encode(cliente.getFotoPerfil())));
        
        logins.put(informacoesCliente);
        
        this.salvarJson();
    }

    public void criaNovaConta(Autor autor) {
        HashMap informacoesAutor = new HashMap();
        informacoesAutor.put("nome", autor.getNome());
        informacoesAutor.put("email", autor.getEmail());
        informacoesAutor.put("senha", autor.getSenha());
        informacoesAutor.put("imagem", new String(Base64.getEncoder().encode(autor.getFotoPerfil())));
        
        logins.put(informacoesAutor);
        
        this.salvarJson();
    }
    
    public void validaLogin(String nomeInserido, String senhaInserida) throws InvalidUserException {
        Optional<HashMap> optionalUser = logins.toList().stream().map(o -> (HashMap) o).filter(o -> o.get("nome").equals(nomeInserido) && o.get("senha").equals(senhaInserida)).findFirst();
        
        if (optionalUser.isEmpty()){
            throw new InvalidUserException("Esse usuário não existe");
        } else {
            HashMap userMap = optionalUser.get();
            logado = new Usuario(
                (String) userMap.get("nome"),
                (String) userMap.get("email"),
                (String) userMap.get("senha"),
                new int[0],
                Base64.getDecoder().decode((String) userMap.get("imagem"))
            );
        }
    }
    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public Usuario getLogado() {
        return logado;
    }
    
    public void salvaFotoPerfil()
    {
        Iterator<Object> iterator = logins.iterator();
        while(iterator.hasNext()){
            JSONObject usuario = (JSONObject) iterator.next();
            if(usuario.get("email").equals(logado.getEmail())){
                System.out.println(logado.getFotoPerfil());
                usuario.put("imagem", new String(Base64.getEncoder().encode(logado.getFotoPerfil())));
                break;
            }
        }
        this.salvarJson();
    }
    

}
