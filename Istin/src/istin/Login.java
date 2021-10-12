package istin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Login {

    public void criaNovaConta(Cliente cliente) {

            JSONArray json;
            JSONParser jsonParser = new JSONParser();

            FileWriter escreve = null;

            try {
                HashMap informacoesCliente = new HashMap();
                informacoesCliente.put("nome", cliente.getNome());
                informacoesCliente.put("email", cliente.getEmail());
                informacoesCliente.put("senha", cliente.getSenha());
                informacoesCliente.put("saldo", cliente.getSaldo());

                json = (JSONArray) jsonParser.parse(new FileReader("logins.json"));
                cliente.setId(json.size());
                json.add(informacoesCliente);

                System.out.println(json.toJSONString());

                escreve = new FileWriter("logins.json");
                escreve.write(json.toJSONString());
                escreve.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }


    }

    public void criaNovaConta(Autor autor) {
        JSONArray json;
        JSONParser jsonParser = new JSONParser();

        FileWriter escreve = null;

        try {
            HashMap informacoesCliente = new HashMap();
            informacoesCliente.put("nome", autor.getNome());
            informacoesCliente.put("email", autor.getEmail());
            informacoesCliente.put("senha", autor.getSenha());

            json = (JSONArray) jsonParser.parse(new FileReader("logins.json"));
            autor.setId(json.size()+100);
            json.add(informacoesCliente);

            System.out.println(json.toJSONString());

            escreve = new FileWriter("logins.json");
            escreve.write(json.toJSONString());
            escreve.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean validaLogin(String nomeInserido, String senhaInserida) {

        JSONArray json;
        JSONParser jsonParser = new JSONParser();

        try {
            json = (JSONArray) jsonParser.parse(new FileReader("logins.json"));
            System.out.println(json.toJSONString());
            
            for (var objeto : json){
                JSONObject usuario = (JSONObject) objeto;
                if(usuario.get("nome").equals(nomeInserido)){
                    if(usuario.get("senha").equals(senhaInserida)) return true;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
