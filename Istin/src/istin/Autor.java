package istin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class Autor extends Usuario {
    
    private final List<Integer> jogosPublicados;
    
     public Autor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.jogosPublicados = new ArrayList<>();
    }
     
    public Autor(String nome, String email, String senha, List<Integer> listaIdJogos) {
        super(nome, email, senha, listaIdJogos);
        this.jogosPublicados = new ArrayList<>();
    }

    public Autor(String nome, String email, String senha, List<Integer> listaIdJogos, List<Integer> jogosPublicados) {
        super(nome, email, senha, listaIdJogos);
        this.jogosPublicados = jogosPublicados;
    }

    public Autor(JSONObject json) {
        super(json);
        
        JSONArray array = json.getJSONArray("jogosPublicados");
        this.jogosPublicados = IntStream.range(0, array.length()).mapToObj(i -> array.getInt(i)).collect(Collectors.toList());
    }
    
    public List<Integer> getJogosPublicados() {
        return jogosPublicados;
    }
    
    public void adicionarJogoPublicado(Jogo jogo) {
        jogosPublicados.add(jogo.getId());
    }

    @Override
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("jogosPublicados", jogosPublicados);
        return json;
    }
}
