package istin;

import istin.generic.JsonSerializavel;
import istin.helpers.CompressorImagem;
import java.time.LocalDateTime;
import java.util.Base64;
import org.json.JSONObject;

public class Jogo implements JsonSerializavel {

    private Integer id;
    private final String nome;
    private final float preco;
    private float mediaAvaliacao;
    private int numeroAvaliacoes;
    private byte[] imagem;
    private Integer autorId;
    private final LocalDateTime dataPublicacao;
    
    /**
     * Construtor da classe que recebe os atributos via arquivo JSON
     * @param json 
     */
    public Jogo(JSONObject json) {
        id = json.getInt("id");
        nome = json.getString("nome");
        preco = json.getFloat("preco");
        mediaAvaliacao = json.getFloat("mediaAvaliacao");
        numeroAvaliacoes = json.getInt("quantidadeAvaliacao");
        imagem = Base64.getDecoder().decode(json.getString("imagem"));
        autorId = json.getInt("autorId");
        dataPublicacao = LocalDateTime.parse(json.getString("dataPublicacao"));
    }
    
    /**
     * Costrutor da classe que recebe os atributos diretamente
     * @param nome
     * @param preco
     * @param imagem
     * @param autorId
     * @param dataPublicacao
     */
    public Jogo(String nome, float preco, byte[] imagem, int autorId, LocalDateTime dataPublicacao) {
        this.nome = nome;
        this.preco = preco;
        this.setImagem(imagem);
        this.autorId = autorId;
        this.dataPublicacao = dataPublicacao;
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

    public final void setImagem(byte[] imagem) {
        this.imagem = CompressorImagem.comprimir(imagem, 117, 150);
    }
    
    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }
    
    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    // Overrides
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("id", id);
        json.put("nome", nome);
        json.put("preco", preco);
        json.put("mediaAvaliacao", mediaAvaliacao);
        json.put("quantidadeAvaliacao", numeroAvaliacoes);
        json.put("imagem", new String(Base64.getEncoder().encode(imagem)));
        json.put("autorId", autorId);
        json.put("dataPublicacao", dataPublicacao.toString());
        
        return json;
    }
    
}
