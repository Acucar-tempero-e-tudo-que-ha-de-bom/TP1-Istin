package istin;

import istin.enums.TipoUsuario;
import istin.generic.GerenciadorJson;
import istin.exceptions.InvalidPasswordException;
import istin.exceptions.InvalidUserException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

/**
 * Classe Singleton que gerencia os logins dos usuarios.
 * Extende a classe GerenciadorJson aplicando a classe Usuario.
 */
public class Login extends GerenciadorJson<Usuario> {
    /**
     * Instância única da classe.
     */
    private static Login instance;
    
    /**
     * Atual usuário logado.
     */
    private Usuario usuarioLogado;
    
    /**
     * Construtor da classe.
     */
    public Login() {
        super("logins.json");
    }
    
    /**
     * Retorna a instância única da classe.
     */
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }
    
    /**
     * Verifica se existe uma conta com um nome de usuario especifico.
     * @param nomeInserido nome de usuario da conta
     * @return verdadeiro se existir uma conta com o nome de usuario fornecido
     */
    public boolean existeContaNome(String nomeInserido) {
        return valueCollection().stream().anyMatch(u -> u.getNome().equals(nomeInserido));
    }
    
    /**
     * Verifica se existe uma conta com um email especifico.
     * @param emailInserido nome de usuario da conta
     * @return verdadeiro se existir uma conta com o email fornecido
     */
    public boolean existeContaEmail(String emailInserido) {
        return valueCollection().stream().anyMatch(u -> u.getEmail().equals(emailInserido));
    }
    
    /**
     * Tenta fazer o login em uma conta específica.
     * @param nomeInserido nome de usuário da conta
     * @param senhaInserida senha da conta
     * @throws InvalidUserException acontece quando não existe uma conta com o nome de usuário fornecido
     * @throws InvalidPasswordException acontece quando a senha fornecida for incorreta
     */
    public void validaLogin(String nomeInserido, String senhaInserida) throws InvalidUserException, InvalidPasswordException {
        Optional<Usuario> optionalUsuario = valueCollection().stream().filter(u -> u.getNome().equals(nomeInserido)).findFirst();
        
        if (optionalUsuario.isEmpty()) {
            throw new InvalidUserException("Esse usuário não existe");
        } else {
            Usuario usuario = optionalUsuario.get();
            if (usuario.getSenha().equals(senhaInserida)) {
                this.setUsuarioLogado(usuario);
            } else {
                throw new InvalidPasswordException("Senha incorreta");
            }
        }
    }
    
    /**
     * Adiciona um jogo publicado a um Autor e salva o arquivo json.
     * @param autor autor do jogo
     * @param jogo jogo publicado
     */
    public void adicionarJogoPublicado(Autor autor, Jogo jogo) {
        autor.adicionarJogoPublicado(jogo);
        salvarJson();
    }
    
    /**
     * Remove um jogo publicado do Autor e salva o arquivo json.
     * @param jogo jogo publicado
     */
    public void removerJogoPublicado(Jogo jogo) {
        Autor autor = (Autor) jsonTratado.get(jogo.getAutorId());
        autor.removerJogoPublicado(jogo);
        salvarJson();
    }
    
    /**
     * Adiciona um jogo avaliado ao Cliente e salva o arquivo json.
     * @param cliente cliente que avaliou o jogo
     * @param idJogo id do jogo avaliado
     */
    public void adicionarJogoAvaliado(Cliente cliente, int idJogo) {
        cliente.adicionaJogoAvaliado(idJogo);
        salvarJson();
    }
    
    /**
     * Define o usuário logado.
     * @param logado usuario 
     */
    public void setUsuarioLogado(Usuario logado) {
        this.usuarioLogado = logado;
    }
    
    /**
     * Retorna o usuário que está logado atualmente.
     * @return usuário logado 
     */
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * Carrega o objeto json em Cliente ou Autor.
     * @param json objeto json
     * @return Cliente ou Autor, dependendo do tipo do objeto
     */
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
