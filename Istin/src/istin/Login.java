package istin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONTokener;


public class Login {
    private JSONArray logins;
    
    public Login() {
        try {
            FileInputStream is = new FileInputStream("logins.json");
            JSONTokener tokener = new JSONTokener(is);
            logins = new JSONArray(tokener);
        } catch(FileNotFoundException e) {
            logins = new JSONArray();
        }
    }
    
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
        
        cliente.setId(logins.length());
        logins.put(informacoesCliente);
        
        this.salvarJson();
    }

    public void criaNovaConta(Autor autor) {
        HashMap informacoesAutor = new HashMap();
        informacoesAutor.put("nome", autor.getNome());
        informacoesAutor.put("email", autor.getEmail());
        informacoesAutor.put("senha", autor.getSenha());
        
        autor.setId(logins.length() + 100);
        logins.put(informacoesAutor);
        
        this.salvarJson();
    }
    
    public boolean validaLogin(String nomeInserido, String senhaInserida) {
        return logins.toList().stream().map(o -> (HashMap) o).anyMatch(o -> o.get("nome").equals(nomeInserido) && o.get("senha").equals(senhaInserida));
    }
}
