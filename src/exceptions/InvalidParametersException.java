package exceptions;

public class InvalidParametersException extends RuntimeException {
    public InvalidParametersException(String msg) {
        super(msg);
    }
}
