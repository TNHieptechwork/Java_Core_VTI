package org.example.Decorator;

public class main {
    public static void main(String[] args) {
        ImageData imageData = new BasicImage("home.jpg");
        System.out.println("Save original Img");
        imageData.save();
        System.out.println("---------------------\n");

        System.out.println("Save compressed Img");
        ImageData imageData1 = new CompressedImage(new BasicImage("compress.jpg"));
        imageData1.save();
        System.out.println("---------------------\n");

        System.out.println("Save Encrypted Img");
        ImageData imageData2 = new EncryptedImage(new BasicImage("encrypt.jpg"));
        imageData2.save();
        System.out.println("---------------------\n");

        System.out.println("Save Compress Img then Encrypt");
        ImageData imageData3 = new EncryptedImage(new CompressedImage(new BasicImage("compressed.jpg")));
        imageData3.save();
    }

}
