package task4.annotations;

//Пусть класс аннотации подразумевает просто подпись на каких-то координатах
public class Annotation {
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
    @Override
    public String toString() {
        return "A " + "(" + x +", " + y + "):" + label;
    }
}
