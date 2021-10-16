package istin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONTokener;

public class Loja implements GerenciadorJson {
        
        private static Loja instance;
        private ArrayList<Jogo> jogos;
        private ArrayList<JPanel> paineis;
        private JSONArray jogosJson;
        
        public Loja () {
            carregaJson();
            jogos = new ArrayList<Jogo>();
            paineis = new ArrayList<JPanel>();
        }
        
        public static Loja getInstance() {
            if (instance == null) {
                instance = new Loja();
            }
            return instance;
        }

        @Override
        public void salvarJson() {
            try {
                FileWriter escreve = new FileWriter("jogos.json");
                escreve.write(jogosJson.toString(4));
                escreve.close();
            } catch(IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void carregaJson() {
            try {
                FileInputStream is = new FileInputStream("jogos.json");
                JSONTokener tokener = new JSONTokener(is);
                jogosJson = new JSONArray(tokener);
            } catch(FileNotFoundException e) {
                jogosJson = new JSONArray();
            }
        }
        
        public void criarJogo(Jogo jogo) {
            HashMap dadosJogo = new HashMap();
            
            dadosJogo.put("id", jogo.getId());
            dadosJogo.put("nome", jogo.getNome());
            dadosJogo.put("preco", jogo.getPreco());
            dadosJogo.put("mediaAvaliacao", jogo.getMediaAvaliacao());
            dadosJogo.put("quantidadeAvaliacao", jogo.getNumeroAvaliacoes());
            
            jogo.setId(jogosJson.length());
            jogosJson.put(dadosJogo);
            
            System.out.println(jogosJson.toString());
        
            this.salvarJson();
        }
        
        public void carregaLoja() {
            
        }
        
        public void adicionaPainel(JPanel painel) {
            paineis.add(painel);
        }

}