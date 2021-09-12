package GameStoreDemo.entities;

public class Gamer extends Customer{
    private String userName;

    public Gamer(String  nationalId, String firstName, String lastName, String userName) {
        super(nationalId, firstName, lastName);
        this.userName = userName;
    }
}
