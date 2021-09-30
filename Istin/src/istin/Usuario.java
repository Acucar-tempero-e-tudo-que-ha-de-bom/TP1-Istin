package istin;

public class Usuario extends Pessoa {
    private float saldo;

    public Usuario(float saldo, int id, String nome, String email, String senha, int[] listaIdJogos) {
        super(id, nome, email, senha, listaIdJogos);
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }
}
