package istin;

import org.json.JSONObject;

public class Cliente extends Usuario {
    private float saldo; // o valor do saldo era final, aí eu tirei. tinha algum motivo pra isso?

    public Cliente(float saldo, String nome, String email, String senha) {
        super(nome, email, senha);
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
    
    @Override
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        json.put("saldo", saldo);
        return json;
    }
}
