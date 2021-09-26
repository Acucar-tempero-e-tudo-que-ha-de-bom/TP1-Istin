package istin;

public class Usuario extends Pessoa {
    private Jogo[] biblioteca;
    private float saldo;

    public Usuario(Jogo[] biblioteca, float saldo, int id, String nome, String email) {
        super(id, nome, email);
        this.biblioteca = biblioteca;
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public Jogo[] getBiblioteca() {
        return biblioteca;
    }
}
