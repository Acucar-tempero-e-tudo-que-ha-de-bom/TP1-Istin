package istin;

import java.util.List;
import org.json.JSONObject;

public class Cliente extends Usuario {
    private final float saldo;

    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil);
        this.saldo = saldo;
    }
    
    public Cliente(float saldo, String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos) {
        super(nome, email, senha, fotoPerfil, listaIdJogos);
        this.saldo = saldo;
    }

    public Cliente(JSONObject json) {
        super(json);
        this.saldo = (float) json.getFloat("saldo");
    }

    public float getSaldo() {
        return saldo;
    }
    
    @Override
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("saldo", saldo);
        return json;
    }
}
