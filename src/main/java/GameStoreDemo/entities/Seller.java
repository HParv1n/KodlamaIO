package GameStoreDemo.entities;

public class Seller extends Customer {

    public Seller(String  nationalId, String firstName, String lastName, int sellerNumber) {
        super(nationalId, firstName, lastName);
        this.sellerNumber = sellerNumber;
    }

    private int sellerNumber;
}
