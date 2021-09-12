package GameStoreDemo.abstracts;

import GameStoreDemo.abstracts.interfaces.SellerService;
import GameStoreDemo.entities.Customer;
import GameStoreDemo.entities.Game;

public abstract class BaseSellerManager implements SellerService {
    @Override
    public  void seller(Game game, Customer customer) {
        System.out.println(game.getGameName() + "oyunu "+ customer.getFirstName() + "kisisine " +game.getPrice() + "TL ye Satildi");
    }
}
