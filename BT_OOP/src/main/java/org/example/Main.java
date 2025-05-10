package org.example;

import org.example.models.Student;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String choice;
        do {
            Student s = new Student();
            s.inPut();
            studentList.add(s);
            System.out.println("Continue(y/n): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("y"));
        for (Student st : studentList) {
            st.display();
            System.out.println("\n --------------------");
        }
        System.out.println("\nStudent's List GPA >= 3.2: \n");
        for (Student st : studentList) {
            st.display_StudentGPA_GT_3dot2();
            System.out.println("\n --------------------");
        }
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getGpa() < studentList.get(j).getGpa()) {
                    Student temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
        System.out.println("\nSorted GPA Descending: \n");
        for (Student st : studentList) {
            st.display();
            System.out.println("\n --------------------");
        }

    }
}