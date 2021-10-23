package istin;

import istin.enums.TipoUsuario;
import java.util.List;
import org.json.JSONObject;

public class Cliente extends Usuario {
    private float saldo;

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
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
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
        return json;
    }
}
