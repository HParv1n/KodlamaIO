package inheritance;

public class Main {
    public static void main(String[] args) {
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "12345 ";

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.customerNumber = "9878987 ";

        CustomerService customerService = new CustomerService();
//        customerService.add(hepsiBurada);
//
//        CustomerService customerService2 = new CustomerService();
//        customerService2.add(individualCustomer);

        Customer[] customers = {hepsiBurada,individualCustomer};

        customerService.addMultiple(customers);

    }
}
