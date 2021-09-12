package Odev2;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Java & React"," Bu kurs 2 aylik tam Java Kursudur"," Ucretsiz");
        Instructor instructor = new Instructor(1,"Engin","Demriog","12345");
        Student student = new Student(1,"Parvin","Hajiaghayev","789456","366a2");

        Course course1 = new Course("Python"," Bu kurs 2 aylik tam Python Kursudur"," Ucretsiz");
        Instructor instructor1 = new Instructor(2,"Albert","Camus","88345");
        Student student1 = new Student(2,"Nargis","Hashimov","700456","364a2");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.section(instructor,course);
        instructorManager.section(instructor1,course1);
        System.out.println("**********************");

        StudentManager studentManager = new StudentManager();
        studentManager.classroom(student);
        studentManager.classroom(student1);
        System.out.println("**********************");


        UserManager userManager = new UserManager();
        User[] users = {student,student1};
        userManager.addMultiple(users);;



        CourseService courseService = new CourseService();
        courseService.addToCourse(course);
        courseService.removedToCourse(course);
    }
}
