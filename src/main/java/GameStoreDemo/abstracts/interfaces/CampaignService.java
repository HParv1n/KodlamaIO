package GameStoreDemo.abstracts.interfaces;

import GameStoreDemo.entities.Customer;
import GameStoreDemo.entities.Game;

public interface CampaignService {
    void campaignAdd(Game game, Customer customer);
    void campaignUpdate(Game game, Customer customer);
    void campaignDelete(Game game, Customer customer);

}
