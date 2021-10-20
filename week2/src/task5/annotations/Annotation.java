package task5.annotations;

import task5.api.Movable;

//Пусть класс аннотации подразумевает просто подпись на каких-то координатах
public class Annotation implements Movable {
    protected String label;
    private int x,y;

    public Annotation(String label){
        this.label = label;
    }
    public Annotation(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public boolean isIncludePoint(int x, int y){
        return this.x == x && this.y == y;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "A " + "(" + x +", " + y + "):" + label;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
