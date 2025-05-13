package org.example.models_BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManager {
    private  List<Course> courseList  = new ArrayList<>();
    private  Scanner scanner = new Scanner(System.in);
    private  Course findCourseById(String id) {
        for (Course c : courseList) {
            if (c.getCourseId().equalsIgnoreCase(id))
                return c;
        }
        return null;
    }

    public void addCourse(Course c) {
        courseList.add(c);
        System.out.println("Added Course!\n");
    }


    public void deleteCourse() {
        System.out.print("Enter course id to delete: ");
        String id = scanner.nextLine();
        Course course = findCourseById(id);
        if (course != null) {
            courseList.remove(course);
            System.out.println("Deleted course.");
        } else {
            System.out.println("Course not found.");
        }
    }
    public void editCourse() {
        System.out.print("Enter course id to edit: ");
        String id = scanner.nextLine();
        Course course = findCourseById(id);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.print("new course name: ");
        String newName = scanner.nextLine();
        course.setCourseName(newName);

        System.out.print("Enter Instructor's id: ");
        String gvId = scanner.nextLine();
        System.out.print("Enter Instructor's name: ");
        String gvName = scanner.nextLine();
        Instructor newGv = new Instructor(gvId, gvName);
        course.setInstructor(newGv);

        System.out.println("Updated.");
    }
}
