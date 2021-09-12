package Odev2;

public class Course {
    private String coursName;
    private String details;
    private String price;

    public Course(String coursName, String details, String price) {
        this.coursName = coursName;
        this.details = details;
        this.price = price;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
