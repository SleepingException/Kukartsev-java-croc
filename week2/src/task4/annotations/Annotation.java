package task4.annotations;

public class Annotation {
    protected String label;
    public Annotation(String label){
        this.label = label;
    }
    @Override
    public String toString() {
        return "Annotation " +
                "{" + "label = " + label  + '}';
    }
}
