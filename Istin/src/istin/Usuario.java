package istin;

import istin.generic.JsonSerializavel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Base64;
import org.json.JSONObject;

public class Usuario implements JsonSerializavel {
    private final String nome;
    private final String email;
    private final String senha;
    private byte[] fotoPerfil;
    private List<Integer> listaIdJogos;

    public Usuario(String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.fotoPerfil = fotoPerfil;
        this.listaIdJogos = listaIdJogos;
    }
    
    public Usuario(String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil, new ArrayList<>())
    }
    
    public Usuario(JSONObject json) {
        nome = json.getString("nome");
        email = json.getString("email");
        senha = json.getString("senha");
        listaIdJogos = json.getJSONArray("jogos").toList().stream().map(o -> (Integer) o).collect(Collectors.toList());
        fotoPerfil = Base64.getDecoder().decode(json.getString("fotoPerfil"));
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

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public void setListaIdJogos(List<Integer> listaIdJogos) {
        this.listaIdJogos = listaIdJogos;
    }
    
    // Overrides
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("nome", nome);
        json.put("email", email);
        json.put("senha", senha);
        json.put("jogos", listaIdJogos);
        json.put("fotoPerfil", new String(Base64.getEncoder().encode(fotoPerfil)))
        json.put("tipo", this.getClass().getSimpleName());
        
        return json;
    }
}
