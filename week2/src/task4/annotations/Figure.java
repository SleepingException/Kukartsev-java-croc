package task4.annotations;


public class Figure extends Annotation {
    private double[][] cords;
    private String note;

    public Figure(String note, double[][] cords){
        this.cords = cords;
        this.note = note;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("F");
        for(int i = 0; i < cords.length; i++){
            stringBuilder.append(" (" + cords[i][0] + ", " + cords[i][1] + "), ");
        }
        stringBuilder.replace(stringBuilder.length()-2,stringBuilder.length()-1,  ": ");
        stringBuilder.append(note);
        return stringBuilder.toString();
    }
}
