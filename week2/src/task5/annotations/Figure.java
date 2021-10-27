package task5.annotations;


import task5.api.Movable;

public abstract class Figure implements Movable {
    @Override
    public abstract boolean equals(Object obj);

    public abstract boolean equals(int x, int y);

    @Override
    public abstract void move(int dx, int dy);

}
