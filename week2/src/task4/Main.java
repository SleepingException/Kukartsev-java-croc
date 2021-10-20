package task4;

import task4.annotations.Annotation;
import task4.annotations.Circle;
import task4.annotations.Figure;
import task4.annotations.Rectangle;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Annotation circle = new Circle("Test Circle", 5, 5,10);
        Annotation rect = new Rectangle("Test Rectangle", 0, 0, 25, 25);
        Annotation figure = new Figure("Test Figure", new int[]{45,24}, new int[]{150, 28}, new int[]{45, 45});
        AnnotatedImage annotatedImage = new AnnotatedImage("some path", circle, rect, figure);
        System.out.println(Arrays.toString(annotatedImage.getAnnotations()));
    }
}
