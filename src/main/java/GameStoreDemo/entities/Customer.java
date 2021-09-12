package GameStoreDemo.entities;

public class Customer {
    private String  nationalId;
    private String firstName;
    private String lastName;

    public Customer(String nationalId, String firstName, String lastName) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
