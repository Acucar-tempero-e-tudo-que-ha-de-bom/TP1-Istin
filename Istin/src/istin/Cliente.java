package istin;

import istin.enums.TipoUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONObject;

public class Cliente extends Usuario {
    private final float saldo;
    private List<Integer> idJogosAvaliados;

    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil);
        this.saldo = saldo;
        this.idJogosAvaliados = new ArrayList<Integer>();
    }
    
    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos, List<Integer> idJogosAvaliados) {
        super(nome, email, senha, fotoPerfil, listaIdJogos);
        this.saldo = saldo;
        this.idJogosAvaliados = idJogosAvaliados;
    }

    public Cliente(JSONObject json) {
        super(json);
        this.saldo = (float) json.getFloat("saldo");
        this.idJogosAvaliados = json.getJSONArray("jogosAvaliados").toList().stream().map(o -> (Integer) o).collect(Collectors.toList());
    }

    public float getSaldo() {
        return saldo;
    }

    public void adicionaJogoAvaliado(Integer idJogo) {
        idJogosAvaliados.add(idJogo);
    }

    public List<Integer> getIdJogosAvaliados() {
        return idJogosAvaliados;
    }
    
    // Overrides
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.CLIENTE;
    }
    
    @Override
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("saldo", saldo);
        json.put("jogosAvaliados", idJogosAvaliados);
        return json;
    }
}
