package org.example.models5;

import java.util.*;

public class LMS {
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addUser(User u){
        users.add(u);
        u.login();
    }
    public void creeateCourse(Instructor i ,String courseId,String title){
        Course c = i.createCourse(courseId,title);
        courses.add(c);
    }
    public void enroll(Student s, Course c) {
        s.enrollCourse(c);
    }

    public void grade(Instructor i, Course c,Student s, double grade){
        i.gradeStudent(c,s,grade);
    }
    public void printGrades(Student st){
        System.out.println("Grade of Student " + st.name + "\n");
        st.viewGrades();
    }
}
