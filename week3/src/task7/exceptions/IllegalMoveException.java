package task7.exceptions;

import task7.util.ChessPosition;

public class IllegalMoveException extends Exception {
    public IllegalMoveException(String message, ChessPosition p1, ChessPosition p2){
        super(message + p1.toString() + " -> " + p2.toString());
    }
}
