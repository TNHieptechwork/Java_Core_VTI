package org.example.models5;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email, List<Course> enrolledCourses) {
        super(id, name, email);
        this.enrolledCourses = enrolledCourses;
    }


    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewGrades(){
        for(Course c : enrolledCourses){
            Double grade = c.getGrades().get(this);
            System.out.println("Course: " + c.getTitle() + " | Grade: " + (grade != null ? grade : "Not Graded"));
        }
    }
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
    @Override
    public void login() {
        System.out.println("Student "+name + "logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student "+name + "logged out.");
    }
}
