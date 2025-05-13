package org.example.models_BT3;

public class VideoFileHandler extends  FileHandler implements Encryptable{
    public VideoFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void encrypt() {

    }

    @Override
    public void read() {
        System.out.println("Playing video: " + fileName);
    }

    @Override
    public void write(String data) {
        System.out.println("Editing video: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Encrypting video: " + fileName);
    }
}
