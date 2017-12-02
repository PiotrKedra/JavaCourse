package exceptions;

public class DirDoesNotExistException extends Exception {
    public DirDoesNotExistException(String message) {
        super(message);
    }

    public DirDoesNotExistException() {
        super("Given dir dose not exist");
    }
}
