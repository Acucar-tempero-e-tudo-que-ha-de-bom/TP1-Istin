package istin;

import istin.generic.GerenciadorJson;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;

public class Loja extends GerenciadorJson<Jogo> {
    private static Loja instance;
    
    /**
     * Construtor da classe
     */    
    public Loja () {
        super("jogos.json");
    }
        
    /**
     * Singleton, retorna uma instância única da classe
     * @return instância única da classe
     */
    public static Loja getInstance() {
        if (instance == null) {
            instance = new Loja();
        }
        return instance;
    }
        
    public Collection<Jogo> getJogos() {
        return jsonTratado.values();
    }
    
    public Map getMapjogos() {
        return jsonTratado;
    }
    
    /**
     * Cria nova instância de um jogo de acordo com as informações contidas no JSONObject
     * @param json informações do jogo a ser instanciado
     * @return nova instância do jogo
     */
    @Override
    protected Jogo carregarObjeto(JSONObject json) {
        return new Jogo(json);
    }

}