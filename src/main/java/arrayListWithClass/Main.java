package arrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<>();
        customers.add(new Customer(1,"Parvin","Hajiaghayev"));
        customers.add(new Customer(2,"Jamil","Kondogbia"));
        customers.add(new Customer(3,"Lionel","Messi"));

        for (Customer customer: customers) {
            System.out.println(customer.id+" "+customer.name+" "+customer.surname+"\n");

        }
    }
}
