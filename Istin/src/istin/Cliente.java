package istin;

public class Cliente extends Usuario {
    private float saldo;

    public Cliente(float saldo, String nome, String email, String senha, int[] listaIdJogos, byte[] fotoPerfil) {
        super(nome, email, senha, listaIdJogos, fotoPerfil);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
}
