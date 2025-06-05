package org.example.Decorator;

public class ImageDecorator implements  ImageData{
    protected ImageData imageData;

    public ImageDecorator(ImageData imageData) {
        this.imageData = imageData;
    }

    @Override
    public void save() {
        imageData.save();
    }
}
