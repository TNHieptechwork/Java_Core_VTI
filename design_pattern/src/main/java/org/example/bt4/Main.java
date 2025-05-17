package org.example.bt4;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("Circle");
        s1.draw();

        Shape s2 = shapeFactory.getShape("sQuaRe");
        s2.draw();
    }
}
