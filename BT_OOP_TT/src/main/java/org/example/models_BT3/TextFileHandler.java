package org.example.models_BT3;

public class TextFileHandler extends FileHandler implements Encryptable,Compressible{
    public TextFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void compress() {
        System.out.println("Compressing text file: " + fileName);
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting text file: " + fileName);
    }

    @Override
    public void read() {
        System.out.println("Reading text file: " + fileName);
    }

    @Override
    public void write(String data) {
        System.out.println("Writing to text file: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Deleting text file: " + fileName);
    }
}
