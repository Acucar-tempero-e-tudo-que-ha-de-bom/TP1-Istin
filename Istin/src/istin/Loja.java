package istin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONTokener;

public class Loja implements GerenciadorJson {
        
        private ArrayList<Jogo> jogos;
        private JSONArray jogosJson;
        
        public Loja () {
            carregaJson();
        }

        @Override
        public void salvarJson() {
            try {
                FileWriter escreve = new FileWriter("logins.json");
                escreve.write(jogosJson.toString(4));
                escreve.close();
            } catch(IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void carregaJson() {
            try {
                FileInputStream is = new FileInputStream("logins.json");
                JSONTokener tokener = new JSONTokener(is);
                jogosJson = new JSONArray(tokener);
            } catch(FileNotFoundException e) {
                jogosJson = new JSONArray();
            }
        }

}
