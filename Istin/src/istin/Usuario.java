package istin;

import istin.enums.TipoUsuario;
import istin.generic.JsonSerializavel;
import istin.helpers.CompressorImagem;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Base64;
import org.json.JSONObject;

/**
 * Superclasse de Autor e de Cliente
 */
public class Usuario implements JsonSerializavel {
    private Integer id;
    private final String nome;
    private final String email;
    private final String senha;
    private byte[] fotoPerfil;
    protected List<Integer> listaIdJogos;

    /**
     * Construtor da classe
     * @param nome          nome do usuario
     * @param email           email do usuario
     * @param senha         senha do usuario
     * @param fotoPerfil     foto do perfil do usuario
     * @param listaIdJogos lista de ID's de jogos que o usuario possui
     */
    public Usuario(String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setFotoPerfil(fotoPerfil);
        this.listaIdJogos = listaIdJogos;
    }
    
    /**
     * Construtor da classe
     * @param nome          nome do usuario
     * @param email           email do usuario
     * @param senha         senha do usuario
     * @param fotoPerfil     foto do perfil do usuario
     */
    public Usuario(String nome, String email, String senha, byte[] fotoPerfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setFotoPerfil(fotoPerfil);
        this.listaIdJogos = new ArrayList<>();
    }
    
    /**
     * Construtor da classe
     * @param json  JSONObject que contém as especificações do usuario
     */
    public Usuario(JSONObject json) {
        id = json.getInt("id");
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

    public final void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = CompressorImagem.comprimir(fotoPerfil, 99, 99);
    }

    public void setListaIdJogos(List<Integer> listaIdJogos) {
        this.listaIdJogos = listaIdJogos;
    }
    
    public TipoUsuario getTipo() {
        return TipoUsuario.INDEFINIDO;
    }
    
    // Overrides
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    
     /**
     * Retorna JSONObject com informações do cliente
     * @return informações do usuario em um JSONObject
     */
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("id", id);
        json.put("nome", nome);
        json.put("email", email);
        json.put("senha", senha);
        json.put("jogos", listaIdJogos);
        json.put("fotoPerfil", new String(Base64.getEncoder().encode(fotoPerfil)));
        json.put("tipo", getTipo());
        
        return json;
    }
}
