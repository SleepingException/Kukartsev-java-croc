package task5.annotations;


public class Circle extends Annotation{
    private int x, y, r;

    public  Circle(String label, int x, int y, int r) {
        super(label);
        this.x = x;
        this.y = y;
        if(r > 0) {
            this.r = r;
        }
        else {
            throw new IllegalArgumentException("R can't be less than 0");
        }
    }

    @Override
    public boolean isIncludePoint(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("C");
        stringBuilder.append(" (" + x + ", " + y + "), " + r);
        stringBuilder.append(" : ");
        stringBuilder.append(label);
        return stringBuilder.toString();
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}