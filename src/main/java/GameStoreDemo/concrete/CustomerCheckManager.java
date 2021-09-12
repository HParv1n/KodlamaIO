package GameStoreDemo.concrete;

import GameStoreDemo.abstracts.interfaces.CustomerCheckService;
import GameStoreDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
