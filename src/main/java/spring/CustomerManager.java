package spring;

public class CustomerManager{

    private CustomerDaoInter customerDaoInter;

    public CustomerManager(CustomerDaoInter customerDaoInter) {
        this.customerDaoInter = customerDaoInter;
    }

    public void add(){
        customerDaoInter.add();
    }
}
