package org.example;

import org.example.models5.Course;
import org.example.models5.Instructor;
import org.example.models5.LMS;
import org.example.models5.Student;

import java.util.*;

public class Main_BT5 {
    public static void main(String[] args) {
        LMS lms = new LMS();

        Instructor ins1 = new Instructor("I01", "Dr. Smith", "smith@example.com", new ArrayList<>());
        Instructor ins2  = new Instructor("I02", "Dr. Strange", "strange@example.com", new ArrayList<>());
        Instructor ins3 = new Instructor("I03", "Ms. Clark", "clark@example.com", new ArrayList<>());

        Student stu1 = new Student("S01", "Alice", "alice@example.com", new ArrayList<>());
        Student stu2 = new Student("S02", "Bob", "bob@example.com", new ArrayList<>());
        Student stu3 = new Student("S03", "Charlie", "charlie@example.com", new ArrayList<>());

        lms.addUser(ins1);
        lms.addUser(ins2);
        lms.addUser(ins3);

        lms.addUser(stu1);
        lms.addUser(stu2);
        lms.addUser(stu3);

        lms.creeateCourse(ins1, "C01", "Java Programming");
        lms.creeateCourse(ins2, "C02", "Database Systems");
        lms.creeateCourse(ins3, "C03", "Web Development");

        Course course1 = ins1.getCourseList().get(0);
        Course course2 = ins2.getCourseList().get(0);
        Course course3 = ins3.getCourseList().get(0);

        lms.enroll(stu1, course1);
        lms.enroll(stu1, course2);


        lms.enroll(stu2, course1);
        lms.enroll(stu2, course3);

        lms.enroll(stu3,course3);
        lms.enroll(stu3, course2);
        lms.enroll(stu3, course3);

        lms.grade(ins1, course1, stu1, 9.0);
        lms.grade(ins1, course1, stu2, 8.5);

        lms.grade(ins2, course2, stu1, 9.2);
        lms.grade(ins2, course2, stu3, 7.8);

        lms.grade(ins3, course3, stu2, 8.0);
        lms.grade(ins3, course3, stu3, 9.5);

        System.out.println("\n--- GRADES ---");
        lms.printGrades(stu1);
        lms.printGrades(stu2);
        lms.printGrades(stu3);

    }
}
