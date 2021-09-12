package GameStoreDemo.abstracts.interfaces;

import GameStoreDemo.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
