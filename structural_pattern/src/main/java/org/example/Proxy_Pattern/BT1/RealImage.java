package org.example.Proxy_Pattern.BT1;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Hiển thị ảnh: " + filename);
    }

    private void loadFromDisk() {
        System.out.println("Đang tải ảnh từ ổ đĩa: " + filename);
    }
}
