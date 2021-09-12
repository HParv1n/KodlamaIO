package Odev2;

public class Instructor extends User{

    private String teacherNumber;

    public Instructor(int id, String name, String surname,String teacherNumber) {
        super(id, name, surname);
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }
}
