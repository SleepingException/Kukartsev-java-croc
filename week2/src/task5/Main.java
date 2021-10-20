package task5;

import task5.annotations.Annotation;
import task5.annotations.Circle;
import task5.annotations.Figure;
import task5.annotations.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Annotation circle = new Circle("Test Circle", 5, 5,10);
        Annotation rect = new Rectangle("Test Rectangle", 0, 0, 25, 25);
        Annotation figure = new Figure("Test Figure", new int[]{45,24}, new int[]{150, 28}, new int[]{45, 45});
        AnnotatedImage annotatedImage = new AnnotatedImage("some path", circle, rect, figure);
        System.out.println(Arrays.toString(annotatedImage.getAnnotations()));
        System.out.println(annotatedImage.findByLabel("Figure"));
        annotatedImage.findByPoint(0,0).move(5, 5);
        System.out.println(annotatedImage.findByLabel("Rect"));
    }
}
