package task4.annotations;


public class Rectangle extends Annotation {
    private  double x1, y1, x2, y2;
    private String note;

    public Rectangle(String note, double x1, double y1, double x2, double y2){
        this.note = note;
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
        stringBuilder.append("(" + x1 + ", " + y1 + ")");
        stringBuilder.append(": ");
        stringBuilder.append(note);
        return stringBuilder.toString();
    }
}
