package org.example.Bridge_Pattern.BT2;

public class Main {
    public static void main(String[] args) {
        DeviceRender mobile = new Mobile();
        DeviceRender desk = new Desktop();

        Documents pdfdoc = new PDF(mobile);
        Documents worddoc= new Word(desk);
        Documents markdowndoc = new Markdown(mobile);

        pdfdoc.display();
        worddoc.display();
        markdowndoc.display();
    }
}
