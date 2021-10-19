package task4;

import task4.annotations.Annotation;
import task4.annotations.Circle;
import task4.annotations.Rectangle;

public class Main {
    public static void main(String[] args) {
        Annotation a1 = new Rectangle("test", 0, 0, 20, 20);
        System.out.println(a1);
    }
}
