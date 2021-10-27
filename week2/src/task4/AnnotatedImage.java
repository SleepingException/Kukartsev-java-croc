package task4;

import task4.annotations.Annotation;

public class AnnotatedImage {

    protected String imagePath;

    protected Annotation[] annotations;


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
}

