package zad1;

public class MatrixDimensionsException extends RuntimeException{
    public MatrixDimensionsException(){
        super("Wrong dimension !!!");
    }
    public MatrixDimensionsException(String message){
        super(message);
    }
}
