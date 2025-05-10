package org.example;

import org.example.models2.Employee;
import org.example.models2.FullTimeEmployee;
import org.example.models2.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main_BT2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FullTimeEmployee("E1","Johny Dark"));
        employeeList.add(new FullTimeEmployee("E2","John Cena"));

        employeeList.add(new PartTimeEmployee("E3","Wayne Johnson",6,28000.00));
        employeeList.add(new PartTimeEmployee("E4","Harzard Clique",8,25000.00));

        double totalSalary = 0;
        for(Employee e : employeeList){
            e.display();
            e.calculateSalary();
            totalSalary += e.calculateSalary();
            System.out.println("\n---------------------");
        }
        System.out.printf("Total salary to pay : %,.2f VNĐ " , totalSalary);
    }
}
