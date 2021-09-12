package spring;

public class Customer {
    private String name;
    private String surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Parvin";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = "Haji";
    }
}
