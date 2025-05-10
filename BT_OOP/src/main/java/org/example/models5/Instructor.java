package org.example.models5;

import java.util.*;

public class Instructor extends User{
    private List<Course> courseList = new ArrayList<>();

    public Instructor(String id, String name, String email, List<Course> courseList) {
        super(id, name, email);
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public void login() {
        System.out.println("Intructor " + name + " logged in");
    }

    @Override
    public void logout() {
        System.out.println("Intructor " + name + " logged out");
    }

    public Course createCourse(String courseId,String title){
        Course course = new Course(courseId,title,this);
        courseList.add(course);
        System.out.println("Added Course: " + title + "\n");
        return course;
    }
    public void gradeStudent(Course course, Student student, double grade) {
        course.assignGrade(student, grade);
    }


}
