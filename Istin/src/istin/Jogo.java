package istin;

public class Jogo {

    private int id;
    private String nome;
    private float preco;
    private float mediaAvaliacao;
    private int numeroAvaliacoes;
    private byte[] imagem;

    public Jogo(String nome, float preco, byte[] imagem) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
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

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    
    
}
