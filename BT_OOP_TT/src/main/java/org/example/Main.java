package org.example;

import org.example.models_BT1.Course;
import org.example.models_BT1.CourseManager;
import org.example.models_BT1.Instructor;
import org.example.models_BT1.Student;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        CourseManager cm = new CourseManager();
        Scanner scanner = new Scanner(System.in);
        Instructor gv1 = new Instructor("GV01", "Nguyễn Văn A");
        Instructor gv2 = new Instructor("GV02", "Trần Thị B");
        Instructor gv3= new Instructor("GV03", "John Cena");

        Student sv1 = new Student("SV01", "Phạm Văn C");
        Student sv2 = new Student("SV02", "Lê Thị D");
        Student sv3 = new Student("SV03", "Ngô Văn E");

        Course c1 = new Course("C101", "Lập trình Java", gv1);
        Course c2 = new Course("C102", "Cấu trúc dữ liệu", gv2);
        Course c3= new Course("C103", "Database", gv3);

        cm.addCourse(c1);
        cm.addCourse(c2);
        cm.addCourse(c3);

        c1.addStudent(sv1);
        c1.addStudent(sv2);
        c2.addStudent(sv1);
        c2.addStudent(sv3);
        c3.addStudent(sv1);
        c3.addStudent(sv3);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1.Edit course");
            System.out.println("2.Delete course");
            System.out.println("3. Print Student's list.");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> cm.editCourse();
                case 2 -> cm.deleteCourse();
                case 3-> {
                    c1.printListStudent();
                    c2.printListStudent();
                    c3.printListStudent();

                    break;
                }
                case 0 -> {
                    System.out.println("Exit.");
                    return;
                }
                default -> System.out.println("Invalid choose!");
            }

        }
    }
}