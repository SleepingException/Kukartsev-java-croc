package task5;

import task5.annotations.Circle;
import task5.annotations.Rectangle;
import task5.annotations.Annotation;
import java.util.Arrays;
/*
Честно говоря, не смог придумать как можно было бы изящно использовать код из 4 таски
    очень жду объяснений в фидбеке =)
 */
public class Main {
    public static void main(String[] args) {
        Annotation circle = new Annotation("Test Circle", new Circle(5, 5,10));
        Annotation rect = new Annotation("Test Rectangle", new Rectangle(0, 0, 25, 25));
        AnnotatedImage annotatedImage = new AnnotatedImage("some path", circle, rect);
        System.out.println(Arrays.toString(annotatedImage.getAnnotations()));
        System.out.println(annotatedImage.findByLabel("Circ"));
        annotatedImage.findByPoint(0,0).getFigure().move(5,5);
        System.out.println(annotatedImage.findByLabel("Rect"));
    }
}
