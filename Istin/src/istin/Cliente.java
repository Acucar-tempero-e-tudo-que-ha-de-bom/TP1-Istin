package istin;

import istin.enums.TipoUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONObject;

public class Cliente extends Usuario {
    private float saldo;
    private List<Integer> idJogosAvaliados;

    /**
     * Construtor da classe
     * @param saldo         saldo do cliente
     * @param nome        nome do cliente
     * @param email         email do cliente
     * @param senha       senha do cliente
     * @param fotoPerfil   foto do perfil do cliente
     */
    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil);
        this.saldo = saldo;
        this.idJogosAvaliados = new ArrayList<Integer>();
    }
    
    /**
     * Construtor da classe
     * @param saldo                     saldo do usuario
     * @param nome                    nome do cliente
     * @param email                     email do cliente
     * @param senha                   senha do cliente
     * @param fotoPerfil               foto do perfil do cliente
     * @param listaIdJogos           lista dos ID's dos jogos que o cliente comprou
     * @param idJogosAvaliados  lista dos ID's dos jogos que o cliente avaliados
     */
    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos, List<Integer> idJogosAvaliados) {
        super(nome, email, senha, fotoPerfil, listaIdJogos);
        this.saldo = saldo;
        this.idJogosAvaliados = idJogosAvaliados;
    }

    /**
     * Contrutor da classe
     * @param json  JSONObject que contém as especificações do autor
     */
    public Cliente(JSONObject json) {
        super(json);
        this.saldo = (float) json.getFloat("saldo");
        this.idJogosAvaliados = json.getJSONArray("jogosAvaliados").toList().stream().map(o -> (Integer) o).collect(Collectors.toList());
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }

    /**
     * Adiciona o ID do jogo comprado à lista de ID's dos jogos comprados
     * @param jogo  Jogo comprado
     */
    public void adicionaJogo(Jogo jogo) {
        listaIdJogos.add(jogo.getId());
    }
    
    /**
     * Adiciona o ID do jogo avaliado à lista de ID's dos jogos comprados
     * @param jogo  jogo avaliado
     */
    public void adicionaJogoAvaliado(Integer idJogo) {
        idJogosAvaliados.add(idJogo);
    }

    public List<Integer> getIdJogosAvaliados() {
        return idJogosAvaliados;
    }
    
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.CLIENTE;
    }
    
    /**
     * Retorna JSONObject com informações do cliente
     * @return informações do cliente em um JSONObject
     */
    @Override
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("saldo", saldo);
        json.put("jogosAvaliados", idJogosAvaliados);
        return json;
    }
}
