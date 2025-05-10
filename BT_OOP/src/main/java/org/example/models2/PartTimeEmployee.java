package org.example.models2;

public class PartTimeEmployee extends Employee{

    private int hoursWokr;
    private double salaryPerHours;

    public PartTimeEmployee(int hoursWokr, double salaryPerHours) {
        this.hoursWokr = hoursWokr;
        this.salaryPerHours = salaryPerHours;
    }

    public PartTimeEmployee(String id, String name, int hoursWokr, double salaryPerHours) {
        super(id, name);
        this.hoursWokr = hoursWokr;
        this.salaryPerHours = salaryPerHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee: Part-Time \n");
        System.out.printf("Salary: " + this.calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return this.hoursWokr * this.salaryPerHours;
    }
}
