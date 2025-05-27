package org.example.Proxy_Pattern.BT2;

public class RealDocument implements Document{
    private String filename;

    public RealDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void read() {
        System.out.println("Đang đọc tài liệu: " + filename);
    }
}
