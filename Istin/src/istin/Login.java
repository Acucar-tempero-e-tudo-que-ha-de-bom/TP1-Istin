package istin;

import istin.enums.TipoUsuario;
import istin.generic.GerenciadorJson;
import istin.exceptions.InvalidUserException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

public class Login extends GerenciadorJson<Usuario> {
    private static Login instance;
    private Usuario usuarioLogado;
    
    public Login() {
        super("logins.json");
    }
    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }
    
    public boolean existeContaNome(String nomeInserido) {
        return valueCollection().stream().anyMatch(u -> u.getNome().equals(nomeInserido));
    }
    
    public boolean existeContaEmail(String emailInserido) {
        return valueCollection().stream().anyMatch(u -> u.getEmail().equals(emailInserido));
    }
    
    public void validaLogin(String nomeInserido, String senhaInserida) throws InvalidUserException {
        Optional<Usuario> optionalUsuario = valueCollection().stream().filter(u -> (u.getNome().equals(nomeInserido) && u.getSenha().equals(senhaInserida))).findFirst();
        
        if (optionalUsuario.isEmpty()){
            throw new InvalidUserException("Esse usuário não existe");
        } else {
            this.setUsuarioLogado(optionalUsuario.get());
        }
    }
    
    public void adicionarJogoPublicado(Autor autor, Jogo jogo) {
        autor.adicionarJogoPublicado(jogo);
        salvarJson();
    }
    
    public void removerJogoPublicado(Jogo jogo) {
        Autor autor = (Autor) jsonTratado.get(jogo.getAutorId());
        autor.removerJogoPublicado(jogo);
        salvarJson();
    }
    
    // Setters and Getters
    public void setUsuarioLogado(Usuario logado) {
        this.usuarioLogado = logado;
    }
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    // Class overrides
    @Override
    protected Usuario carregarObjeto(JSONObject json) {
        TipoUsuario tipo = json.getEnum(TipoUsuario.class, "tipo");
        switch (tipo) {
            case CLIENTE -> {
                return new Cliente(json);
            }
            case AUTOR -> {
                return new Autor(json);
            }
            default -> Logger.getLogger(Login.class.getName()).log(Level.WARNING, "Tipo de usuario invalido");
        }
        return new Usuario(json);
    }
}
