package org.example.models_BT1;
import  java.util.*;
public class Course {
    private String courseId;
    private String courseName;
    private Instructor instructor;
    private List<Student> students;

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Added Student! \n");
        }
    }
    public void printListStudent(){
        System.out.println("List of Student: \n");
        for(Student s : students){
            System.out.println("Id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Course: " + this.courseName);
            System.out.println("\n_________________-");
        }
    }

    public Course(String courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
