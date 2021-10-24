package istin.exceptions;

/**
 * Erro que acontece quando a senha inserida é incorreta.
 */
public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
