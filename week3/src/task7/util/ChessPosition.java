 package task7.util;

import task7.exceptions.IllegalMoveException;
import task7.exceptions.IllegalPositionException;

public class ChessPosition {
    private int firstCoordinate;
    private int secondCoordinate;

    public ChessPosition(int c1, int c2) throws IllegalPositionException {
        if(c1 < 1 || c1 > 8) {
            throw new IllegalPositionException("Столбец должен быть в пределах от a до h", PositionColumn.values()[c1-1].toString());
        }
        else {
            firstCoordinate = c1;
        }
        if (c2 < 1 || c2 > 8){
            throw new IllegalPositionException("Строка должна быть в пределах от 1 до 8", c2);
        }
        else {
            secondCoordinate = c2;
        }
    }
    public boolean canMove(ChessPosition pos) throws IllegalMoveException {
        if((Math.abs(firstCoordinate - pos.firstCoordinate) == 1 && Math.abs(secondCoordinate - pos.secondCoordinate) == 2)
        || (Math.abs(firstCoordinate - pos.firstCoordinate) == 2 && Math.abs(secondCoordinate - pos.secondCoordinate) == 1))
            return true;
        else {
            throw new IllegalMoveException("Конь не может так ходить: ", this, pos);
        }

    }

    @Override
    public String toString() {
        return PositionColumn.values()[firstCoordinate-1].toString()+secondCoordinate;
    }

    public int getFirstCoordinate() {
        return firstCoordinate;
    }

    public int getSecondCoordinate() {
        return secondCoordinate;
    }
}
