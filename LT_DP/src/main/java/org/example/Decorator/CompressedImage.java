package org.example.Decorator;

public class CompressedImage extends ImageDecorator{

    public CompressedImage(ImageData imageData) {
        super(imageData);
    }
    public void compress(){
        System.out.println("Image compressed");
    }
    @Override
    public void save() {
        compress();
        super.save();
    }
}
