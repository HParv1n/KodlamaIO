package GameStoreDemo.adapters;

import GameStoreDemo.abstracts.interfaces.CustomerCheckService;
import GameStoreDemo.entities.Customer;

public class EdevletServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
       return customer.getNationalId().length() == 11;
    }
}
