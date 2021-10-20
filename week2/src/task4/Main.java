package task4;

import task4.annotations.Annotation;
import task4.annotations.Circle;
import task4.annotations.Figure;
import task4.annotations.Rectangle;


public class Main {
    public static void main(String[] args) {
        Annotation a1 = new Figure("test", new int[]{});
        System.out.println(a1);
    }
}
