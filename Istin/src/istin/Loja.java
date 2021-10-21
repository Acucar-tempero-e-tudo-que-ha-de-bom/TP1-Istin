package istin;

import istin.generic.GerenciadorJson;
import java.util.Collection;
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
        
    public Collection<Jogo> getJogos() {
        return jsonTratado.values();
    }

    @Override
    protected Jogo carregarObjeto(JSONObject json) {
        return new Jogo(json);
    }

}