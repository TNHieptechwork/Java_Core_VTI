package org.example.models2;

public abstract class Employee {
    protected String id;
    protected String name;
    public abstract double calculateSalary();

    public void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
