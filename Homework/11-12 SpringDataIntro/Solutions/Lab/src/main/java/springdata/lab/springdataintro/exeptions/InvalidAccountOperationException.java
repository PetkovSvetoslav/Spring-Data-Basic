package springdata.lab.springdataintro.exeptions;

public class InvalidAccountOperationException extends RuntimeException {
    public InvalidAccountOperationException() {
    }

    public InvalidAccountOperationException(String message) {
        super(message);
    }

    public InvalidAccountOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAccountOperationException(Throwable cause) {
        super(cause);
    }
}
