package task4.annotations;


public class Circle extends Figure {
    private int x, y, r;

    public Circle(int x, int y, int r) {
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
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("C");
        stringBuilder.append(" (" + x + ", " + y + "), " + r);
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }
}
