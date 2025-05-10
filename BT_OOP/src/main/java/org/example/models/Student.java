package org.example.models;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
    }
    public void display_StudentGPA_GT_3dot2(){
        if(this.gpa >= 3.2){
            display();
        }
    }
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        String c;
        boolean flag = false;
        boolean ageCheck = false;
        System.out.println("Enter Id: \n");
        this.id = sc.nextLine();
        System.out.println("Enter Name:\n");
        this.name = sc.nextLine();

        while (!ageCheck) {
            try {
                System.out.println("Enter age: \n");
                this.age = sc.nextInt();
                if (this.age >= 18) {
                    ageCheck = true;
                } else {
                    System.out.println("age must >= 18");
                }
            } catch (Exception e) {
                System.out.println("age is invalid & age must be INTEGER!");
            }
        }
        while (!flag) {
            try {
                System.out.println("Enter gpa: \n");
                this.gpa = sc.nextDouble();
                if (this.gpa >= 0 && this.gpa <= 10) {
                    flag = true;
                } else {
                    System.out.println("gpa must between 0 and 10: ");
                }
            } catch (Exception e) {
                System.out.println("gpa is invalid");
            }
        }
    }
}

