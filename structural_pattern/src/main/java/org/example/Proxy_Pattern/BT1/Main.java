package org.example.Proxy_Pattern.BT1;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("hinh1.png");
        Image img2 = new ProxyImage("hinh2.png");


        img1.display();
        img2.display();
    }
}
