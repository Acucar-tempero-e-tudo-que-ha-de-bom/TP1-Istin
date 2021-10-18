package istin;

import istin.generic.GerenciadorJson;
import java.util.List;
import org.json.JSONObject;

public class Loja extends GerenciadorJson<Jogo> {
    private static Loja instance;
        
    public Loja () {
        super("jogos.json");
    }
        
    public static Loja getInstance() {
        if (instance == null) {
            instance = new Loja();
        }
        return instance;
    }
        
    public void criarJogo(Jogo jogo) {
        jogo.setId(jsonTratado.size());
        jsonTratado.add(jogo);
        this.salvarJson();
    }
        
    public List<Jogo> getJogos() {
        return jsonTratado;
    }

    @Override
    protected Jogo carregarObjeto(JSONObject json) {
        return new Jogo(json);
    }

}