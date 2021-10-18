package istin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Loja implements GerenciadorJson {
        
        private static Loja instance;
        private List<Jogo> jogos;
        
        public Loja () {
            carregaJson();
        }
        
        public static Loja getInstance() {
            if (instance == null) {
                instance = new Loja();
            }
            return instance;
        }

        @Override
        public void salvarJson() {
            try (FileWriter escreve = new FileWriter("jogos.json")) {
                JSONArray jogosJson = new JSONArray(jogos.stream().map(Jogo::toJSON).collect(Collectors.toList()));
                escreve.write(jogosJson.toString(4));
            } catch(IOException ex) {
                Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public final void carregaJson() {
            try {
                FileInputStream is = new FileInputStream("jogos.json");
                JSONTokener tokener = new JSONTokener(is);
                
                JSONArray jogosJson = new JSONArray(tokener);
                jogos = IntStream.range(0, jogosJson.length()).mapToObj(i -> {
                    JSONObject json = jogosJson.getJSONObject(i);
                    return new Jogo(json);
                }).collect(Collectors.toList());
            } catch(FileNotFoundException e) {
                jogos = new ArrayList<>();
            }
        }
        
        public void criarJogo(Jogo jogo) {
            jogo.setId(jogos.size());
            jogos.add(jogo);
            this.salvarJson();
        }
        
        public List<Jogo> getJogos() {
            return jogos;
        }

}