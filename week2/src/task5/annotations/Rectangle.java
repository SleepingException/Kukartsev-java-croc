package task5.annotations;


public class Rectangle extends Figure {
    private int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("R");
        stringBuilder.append(" (" + x1 + ", " + y1 + "), ");
        stringBuilder.append("(" + x2 + ", " + y2 + ")");
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(this.toString());
    }

    @Override
    public boolean equals(int x, int y) {
        return this.x1 == x || this.x2 == x && this.y1 == y || this.y2 == y;
    }

    @Override
    public void move(int dx, int dy) {
        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
    }
}
