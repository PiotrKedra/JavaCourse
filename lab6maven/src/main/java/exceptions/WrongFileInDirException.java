package exceptions;

public class WrongFileInDirException extends Exception {
    public WrongFileInDirException() {
        super("Wrong file extension");
    }

    public WrongFileInDirException(String message) {
        super(message);
    }
}
