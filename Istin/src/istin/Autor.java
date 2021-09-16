package istin;

public class Autor extends Pessoa{
    private Jogo[] publicacoes;

    public Autor(Jogo[] publicacoes, int id, String nome, String email) {
        super(id, nome, email);
        this.publicacoes = publicacoes;
    }
    
    public Jogo[] getPublicacoes() {
        return publicacoes;
    }
}
