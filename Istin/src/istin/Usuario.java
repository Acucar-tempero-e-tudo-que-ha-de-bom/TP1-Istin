package istin;

import istin.generic.JsonSerializavel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class Usuario extends JsonSerializavel {
    private final String nome;
    private final String email;
    private final String senha;
    private List<Integer> listaIdJogos;

    public Usuario(String nome, String email, String senha, List<Integer> listaIdJogos) {
        super(null);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaIdJogos = listaIdJogos;
    }
    
    public Usuario(String nome, String email, String senha) {
        super(null);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaIdJogos = new ArrayList<>();
    }
    
    public Usuario(JSONObject json) {
        super(json);
        this.nome = json.getString("nome");
        this.email = json.getString("email");
        this.senha = json.getString("senha");
        this.listaIdJogos = json.getJSONArray("jogos").toList().stream().map(o -> (Integer) o).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Integer> getListaIdJogos() {
        return listaIdJogos;
    }

    public void setListaIdJogos(List<Integer> listaIdJogos) {
        this.listaIdJogos = listaIdJogos;
    }
    
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("nome", nome);
        json.put("email", email);
        json.put("senha", senha);
        json.put("jogos", listaIdJogos);
        json.put("tipo", this.getClass().getSimpleName());
        
        return json;
    }
}
