package istin;

import istin.enums.TipoUsuario;
import java.util.List;
import org.json.JSONObject;

public class Autor extends Usuario {
    
    /**
     * Construtor da classe
     * @param nome           nome do autor
     * @param email            email do autor 
     * @param senha          senha do autor
     * @param fotoPerfil      foto de perfil do autor
     */
     public Autor(String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil);
    }
     
     /**
      * Construtor da classe
      * @param nome            nome do autor
      * @param email             email do autor
      * @param senha           senha do autor
      * @param fotoPerfil       foto de perfil do autor
      * @param listaIdJogos   lista de ID's dos jogos que o autor publicou
      */
    public Autor(String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos) {
        super(nome, email, senha, fotoPerfil, listaIdJogos);
    }

    /**
     * Construtor da classe
     * @param json  JSONObject que contém as especificações do autor
     */
    public Autor(JSONObject json) {
        super(json);
    }

    public List<Integer> getJogosPublicados() {
        return listaIdJogos;
    }
    
    /**
     * Adiciona o ID do jogo publicado à lista de ID's dos jogos publicados
     * @param jogo  jogo publicado
     */
    public void adicionarJogoPublicado(Jogo jogo) {
        listaIdJogos.add(jogo.getId());
    }
    
    /**
     * Remove o ID do jogo publicado da lista de ID's dos jogos publicados
     * @param jogo jogo removido
     */
    public void removerJogoPublicado(Jogo jogo) {
        listaIdJogos.removeIf(valor -> valor.equals(jogo.getId()));
    }
    
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.AUTOR;
    }
    
}
