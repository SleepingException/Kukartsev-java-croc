package task4.annotations;


public class Circle extends Annotation {
    private double x, y, r;
    private String note;

    public  Circle(String note, double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.note = note;
        if(r > 0) {
            this.r = r;
        }
        else {
            System.out.println("R can't be less than 0");
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("C");
        stringBuilder.append(" (" + x + ", " + y + "), " + r);
        stringBuilder.append(" : ");
        stringBuilder.append(note);
        return stringBuilder.toString();
    }
}
