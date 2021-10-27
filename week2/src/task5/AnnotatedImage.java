package task5;

import task5.annotations.Annotation;

public class AnnotatedImage {

    private String imagePath;
    private Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }
    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    public Annotation findByPoint(int x, int y) throws RuntimeException{
        for (Annotation elem : annotations) {
            if (elem.getFigure().equals(x, y)){
                return elem;
            }
        }
        throw new RuntimeException("Element wasn't found");
    }
    public Annotation findByLabel(String label) throws RuntimeException{
        for (Annotation elem : annotations) {
            if(elem.getLabel().contains(label)){
                return elem;
            }
        }
        throw new RuntimeException("Element wasn't found");
    }
}

