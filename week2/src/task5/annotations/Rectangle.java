package task5.annotations;


public class Rectangle extends Annotation {
    private int x1, y1, x2, y2;

    public Rectangle(String label, int x1, int y1, int x2, int y2){
        super(label);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public boolean isIncludePoint(int x, int y) {
        return x1 == x && y1 == y || x2 == x && y2 == y;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("R");
        stringBuilder.append(" (" + x1 + ", " + y1 + "), ");
        stringBuilder.append("(" + x2 + ", " + y2 + ")");
        stringBuilder.append(": ");
        stringBuilder.append(label);
        return stringBuilder.toString();
    }

    @Override
    public void move(int dx, int dy) {
        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
    }
}
