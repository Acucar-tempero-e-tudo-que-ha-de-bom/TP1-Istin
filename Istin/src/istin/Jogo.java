package istin;

public class Jogo {

    private int id;
    private String nome;
    private float preco;
    private float mediaAvaliacao;
    private int numeroAvaliacoes;

    public Jogo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public float getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public int getNumeroAvaliacoes() {
        return numeroAvaliacoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMediaAvaliacao(float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public void setNumeroAvaliacoes(int numeroAvaliacoes) {
        this.numeroAvaliacoes = numeroAvaliacoes;
    }

    
    
}
