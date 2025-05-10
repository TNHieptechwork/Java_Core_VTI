package org.example.models5;

import java.util.*;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();
    private Map<Student, Double> grades = new HashMap<>();

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }
    public void addStudent(Student s){
        if(!students.contains(s)){
            students.add(s);
            System.out.println("Added " + s.name + "\n");
        }
    }
    public void assignGrade(Student s,double grade){
        if(students.contains(s)){
            grades.put(s,grade);
        }
        else{
            System.out.println("Student not yet enrolled this course");
        }
    }
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Map<Student, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<Student, Double> grades) {
        this.grades = grades;
    }
}
