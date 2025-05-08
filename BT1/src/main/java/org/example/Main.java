package org.example;

import java.security.Key;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static class CourseManager{
        Map<String,Student> students = new HashMap<>();
        Map<String,Course> courses = new HashMap<>();
        List<Enrollment> lsEnrollment = new ArrayList<>();

        public void addStudentSample(String id,String name,String email){
            students.put(id, new Student(id, name, email));
        }

        public void addCourseSample(String id,String title,int maxStudents){
            courses.put(id,new Course(id,title,maxStudents));
        }

        public void enrollCourse(String studentId, String courseId){
            Student st = findStudentById(studentId);
            Course cr = findCourseById(courseId);

            if(st == null || cr == null){
                System.out.println("student || course not found");
                return;
            }
            if(cr.isFull()){
                System.out.println("Course is full");
                return;
            }
            boolean enrolled = false;
            for(Enrollment e : lsEnrollment){
                if(e.getStudent().getId().equals(studentId) && e.getCourse().getId().equals(courseId)){
                    enrolled = true;
                    break;
                }
            }
            if(enrolled){
                System.out.printf("Course was enrolled");
            }
            Enrollment enrollment = new Enrollment(st,cr, LocalDate.now());
            lsEnrollment.add(enrollment);
            System.out.printf("Enrolled " + st.getName() + " to " +cr.getTitle() +"\n");
        }

        public void printStudentsByCourseSorted(String courseId){
            Course course = findCourseById(courseId);
            if(course == null){
                System.out.printf("not found course \n");
                return;
            }
            List<Enrollment> courseEnrollment = new ArrayList<>();
            for(Enrollment e : lsEnrollment){
                if(e.getCourse().getId().equals(courseId))
                    courseEnrollment.add(e);
            }
            if(courseEnrollment.isEmpty()){
                System.out.printf("Not existed Student in that Course: " + course.getTitle() + "\n");
            }
            for(int i = 0 ;i < courseEnrollment.size() - 1;i++){
                for(int j = i + 1;j < courseEnrollment.size();j++){
                    if(courseEnrollment.get(i).getEnrollmentDate().compareTo(courseEnrollment.get(j).getEnrollmentDate()) >0){
                        Enrollment temp = courseEnrollment.get(i);
                        courseEnrollment.set(i, courseEnrollment.get(j));
                        courseEnrollment.set(j, temp);
                    }
                }
            }
            System.out.printf("\n List Students of Course " + course.getTitle() + " \n");
            for (Enrollment en : courseEnrollment){
                Student  s = en.getStudent();
                System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " EnrollmentDate" + en.getEnrollmentDate() + " \n");
            }
        }
        private Course findCourseById(String courseId) {
            for(Course c : courses.values()){
                if(c.getId().equals(courseId))
                    return c;
            }
            return null;
        }

        private Student findStudentById(String id) {
            for(Student st : students.values()){
                if(st.getId().equals(id)){
                    return  st;
                }
            }
            return  null;
        }

        public void findStudentByNameOrEmail(String keyword){
            boolean flag = false;
            keyword = keyword.toLowerCase();

            for(Student st : students.values()){
                if(st.getName().toLowerCase().contains(keyword) || st.getEmail().toLowerCase().contains(keyword)){
                    System.out.printf("ID: " + st.getId() + " -  Name: " + st.getName() + " -  Email " + st.getEmail() + "\n");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("No students found matching: " + keyword);
            }
        }

        public void printCourseHaveOneStudent(String st){
            boolean flag = false;
            Student s = findStudentById(st);
            if (s == null) {
                System.out.println("Student not found.");
                return;
            }
            for(Enrollment e : lsEnrollment){
                if(e.getStudent().getId() == s.getId()){
                    Course cr = e.getCourse();
                    int count = 0;
                    for(Enrollment ecount : lsEnrollment){
                        if(ecount.getCourse().getId().equals(cr.getId()))
                            count++;
                    }
                    if(count == 1){
                        System.out.printf("Course_Id: " + cr.getId() +" - " + " Title : " + cr.getTitle() +" \n");
                        flag = true;
                    }
                    else{
                        System.out.printf(cr.getTitle() + " not yet enrolled \n");
                    }
                }
            }
        }

        public void printStudentEnrolledMaxCourse(){
            int max = 0;
            Student maxStudent = null;
            for(Student s : students.values()){
                int count = 0;
                for(Enrollment e : lsEnrollment){
                    if(e.getStudent().getId().equals(s.getId())){
                        count++;
                    }
                }
                if(count > max){
                    max= count;
                    maxStudent = s;
                }
            }
            if(maxStudent != null){
                System.out.printf("\n Student enrolled Max Course: " + maxStudent.getName() + " with " + max + " Course \n");
            }
        }

        public void printCourseMaxStudent(){
            int max = 0;
            Course maxCourse = null;
            for(Course cr : courses.values()){
                int count = 0;
                for(Enrollment e : lsEnrollment){
                    if(e.getCourse().getId().equals(cr.getId())){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                    maxCourse = cr;
                }
            }
            if(maxCourse != null){
                System.out.println("\n Course Max Student is : " + maxCourse.getTitle() + " have " + max + " Student");
            }
        }

    }

    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        manager.addStudentSample("S1", "Nguyen A", "a@domain.com");
        manager.addStudentSample("S2", "Nguyen B", "b@domain.com");
        manager.addStudentSample("S3", "Nguyen C", "c@domain.com");

        manager.addCourseSample("MH1", "Java Core", 12);
        manager.addCourseSample("MH2", "C#", 23);
        manager.addCourseSample("MH3", "C++", 30);

        manager.enrollCourse("S1","MH1");
        manager.enrollCourse("S1","MH2");
        manager.enrollCourse("S2","MH2");

        do {
            System.out.println("\n--- COURSE MANAGEMENT MENU ---");
            System.out.println("1. Enroll student to course");
            System.out.println("2. Print students of a course (sorted by enrollment date)");
            System.out.println("3. Show courses with only 1 student for a given student");
            System.out.println("4. Show course with most students");
            System.out.println("5. Show student enrolled in most courses");
            System.out.println("6. Find student by name or email");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID to enroll: ");
                    String sid = scanner.nextLine();
                    System.out.print("Enter Course ID to enroll into: ");
                    String cid = scanner.nextLine();
                    manager.enrollCourse(sid, cid);
                    break;
                case 2:
                    System.out.print("Enter Course ID to view enrolled students: ");
                    String courseId = scanner.nextLine();
                    manager.printStudentsByCourseSorted(courseId);
                    break;

                case 3:
                    System.out.print("Enter Student ID to check courses with only 1 student: ");
                    String stid = scanner.nextLine();
                    manager.printCourseHaveOneStudent(stid);
                    break;

                case 4:
                    manager.printCourseMaxStudent();
                    break;

                case 5:
                    manager.printStudentEnrolledMaxCourse();
                    break;
                case 6:
                    System.out.printf("Enter Student's Name or Email: ");
                    String type = scanner.nextLine();
                    manager.findStudentByNameOrEmail(type);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

    }

}