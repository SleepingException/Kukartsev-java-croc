package task4;

import task4.annotations.Annotation;
import task4.annotations.Circle;
import task4.annotations.Rectangle;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Annotation circle = new Annotation("Test Circle", new Circle(5, 5,10));
        Annotation rect = new Annotation("Test Rectangle", new Rectangle(0, 0, 25, 25));
        AnnotatedImage annotatedImage = new AnnotatedImage("some path", circle, rect);
        System.out.println(Arrays.toString(annotatedImage.getAnnotations()));
    }
}
