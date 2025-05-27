package org.example.Composite_Pattern.BT1;

public class Staff implements Employee{
    private String name;
    private String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(" " + "- " + position + ": " + name );
    }
}
