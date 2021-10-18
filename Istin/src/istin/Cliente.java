package istin;

public class Cliente extends Usuario {
    private float saldo;

    public Cliente(float saldo, String nome, String email, String senha, int[] listaIdJogos) {
        super(nome, email, senha, listaIdJogos);
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }
}
