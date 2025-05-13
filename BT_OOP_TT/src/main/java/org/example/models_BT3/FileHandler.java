package org.example.models_BT3;

public abstract class FileHandler {
    protected String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public abstract void read();
    public abstract void write(String data);
    public abstract void delete();

}
