package GameStoreDemo.abstracts;

import GameStoreDemo.abstracts.interfaces.CampaignService;
import GameStoreDemo.entities.Customer;
import GameStoreDemo.entities.Game;

public abstract class BaseCampaignManager implements CampaignService {
    @Override
    public void campaignAdd(Game game, Customer customer) {
        System.out.println(game.getGameName()+" oyunu "+ customer.getFirstName()+"tarafindan idirime gidildi ");
    }

    @Override
    public void campaignUpdate(Game game, Customer customer) {
        System.out.println(game.getGameName()+" oyunun yeni fiyati "+game.getPrice());
    }

    @Override
    public void campaignDelete(Game game, Customer customer) {
        System.out.println(game.getGameName()+"oynunun indirimine "+customer.getFirstName()+"kisisi tarafindan son verildi");
    }
}
