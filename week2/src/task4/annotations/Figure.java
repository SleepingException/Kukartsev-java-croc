package task4.annotations;

/*
Если я правильно понял, то класс Figure должен определять фигуру произвольной геометрии.
Соответственно произвольная геометрия имеет неограниченное кол-во точек.
 */
public class Figure extends Annotation {
    private int[][] cords; //массив точек в формате [[x0, y0], [x1, y1]...[xn, yn]]

    public Figure(String label, int[]... cords){
        super(label);
        if (cords.length > 0){ this.cords = cords;}
        else {throw new IllegalArgumentException("There is no coordinates");}
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("F");
        for(int i = 0; i < cords.length; i++){
            if (cords[i].length > 0) {
                stringBuilder.append(" (" + cords[i][0] + "," + cords[i][1] + "),");
            }
            else {
                continue;
            }
        }
        //честно говоря небольшой костыль, но прога не падает в ошибку если передать одну точку без координат
        if (stringBuilder.length() > 2) {
            stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), ": ");
        }
        else {
            stringBuilder.append(": ");
        }
            stringBuilder.append(label);
        return stringBuilder.toString();
    }
}
