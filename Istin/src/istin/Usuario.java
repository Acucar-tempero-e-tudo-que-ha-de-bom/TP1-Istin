package istin;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private Jogo[] biblioteca;
    private float saldo;

    public int getId() {
        return id;
    }

    public float getSaldo() {
        return saldo;
    }

    public Jogo[] getBiblioteca() {
        return biblioteca;
    }
}
