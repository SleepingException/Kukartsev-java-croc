package task7.exceptions;

public class IllegalPositionException extends Exception {
    public IllegalPositionException(String message, int x){
        super(message + ":" + x);
    }
    public IllegalPositionException(String message, String x){
        super(message + ":" + x);
    }
}
