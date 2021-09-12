package inheritance;

public class CustomerService {
    public void add(Customer customer){
        System.out.println(customer.customerNumber+"kayd edildi");
    }

    public void addMultiple(Customer[]customers){
        for (Customer customer: customers){
            add(customer);
        }
    }
}
