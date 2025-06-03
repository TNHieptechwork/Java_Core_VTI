package org.example.AbstractFactory;

public class App {
    private Button button;
    private TextField textField;

    public App(UIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void renderUI() {
        button.render();
        textField.render();
    }
}
