package org.example.Decorator;

public class EncryptedImage extends ImageDecorator{

    public EncryptedImage(ImageData imageData) {
        super(imageData);
    }
    public void encrypt(){
        System.out.println("Image Encrypted");
    }
    @Override
    public void save() {
        encrypt();
        super.save();
    }
}
