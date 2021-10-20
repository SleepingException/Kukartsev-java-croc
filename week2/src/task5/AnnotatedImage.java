package task5;

import task5.annotations.Annotation;

public class AnnotatedImage {

    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    public Annotation findByPoint(int x, int y) {
        for (Annotation elem : annotations) {
            if (elem.isIncludePoint(x, y)){
                return elem;
            }
        }
        return null; //существует ли вариант выдавать что то кроме null?
    }
    public Annotation findByLabel(String label) {
        for (Annotation elem : annotations) {
            if(elem.getLabel().contains(label)){
                return elem;
            }
        }
        return null;
    }
}

