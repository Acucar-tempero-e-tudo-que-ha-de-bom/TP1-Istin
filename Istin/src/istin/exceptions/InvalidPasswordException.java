package istin.exceptions;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
