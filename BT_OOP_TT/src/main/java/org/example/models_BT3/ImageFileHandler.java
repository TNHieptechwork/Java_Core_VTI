package org.example.models_BT3;

public class ImageFileHandler extends FileHandler implements Compressible{
    public ImageFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void compress() {
        System.out.println("Compressing image: " + fileName);
    }


    @Override
    public void read() {
        System.out.println("Viewing image: " + fileName);
    }

    @Override
    public void write(String data) {
        System.out.println("Editing image file: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Deleting image file: " + fileName);
    }

}
