package istin;

import istin.enums.TipoUsuario;
import java.util.List;
import org.json.JSONObject;

public class Autor extends Usuario {
    
     public Autor(String nome, String email, String senha, byte[] fotoPerfil) {
        super(nome, email, senha, fotoPerfil);
    }
     
    public Autor(String nome, String email, String senha, byte[] fotoPerfil, List<Integer> listaIdJogos) {
        super(nome, email, senha, fotoPerfil, listaIdJogos);
    }

    public Autor(JSONObject json) {
        super(json);
    }
    
    public List<Integer> getJogosPublicados() {
        return listaIdJogos;
    }
    
    public void adicionarJogoPublicado(Jogo jogo) {
        listaIdJogos.add(jogo.getId());
    }
    
    public void removerJogoPublicado(Jogo jogo) {
        listaIdJogos.removeIf(valor -> valor.equals(jogo.getId()));
    }
    
    //Overrides
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.AUTOR;
    }
    
}
