package org.example.models2;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee: Full-Time \n");
        System.out.println("Fixed salary: " + this.calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return 5000000.00;
    }
}
