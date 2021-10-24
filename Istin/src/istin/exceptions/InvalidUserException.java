package istin.exceptions;

/**
 * Erro que acontece quando o nome de usuário inserido é incorreto.
 */
public class InvalidUserException extends Exception {
    public InvalidUserException(String errorMessage) {
        super(errorMessage);
    }
}
