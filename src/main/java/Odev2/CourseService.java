package Odev2;

public class CourseService {

    public void addToCourse(Course course){
        System.out.println(course.getCoursName()+" "+" kursuna basarili sekilde kayit olundu. ");
    }

    public void removedToCourse(Course course){
        System.out.println(course.getCoursName()+" "+" kursuna kayitiniz iptal edildi.");
    }
}
