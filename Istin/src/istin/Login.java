package istin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import org.json.simple.JSONObject;


public class Login {
    
    public void criaNovaConta(String login, String senha) {
        
        JSONObject json = new JSONObject();
        
        FileReader le = null;
        FileWriter escreve = null;
        
        json.put("login", login);
        json.put("senha", senha);

        
        try {
            escreve = new FileWriter("logins.json");
            escreve.write(json.toJSONString());
            escreve.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(json.toJSONString());
    }
    
    public boolean validaLogin(String nomeInserido) {
        return true;
    }
    
    public boolean validaSenha(String senhaInserida) {
        return true;
    }
}
