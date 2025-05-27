package org.example.Composite_Pattern.BT1;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> employeeList = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void add(Employee e){
        employeeList.add(e);
    }
    public void del(Employee e){
        employeeList.remove(e);
    }
    @Override
    public void showDetails() {
        System.out.println(" " + "+ " + position + ": " + name);
        for(Employee e : employeeList){
            e.showDetails();
        }
    }
}
