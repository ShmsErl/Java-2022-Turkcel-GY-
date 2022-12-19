package LayerDemo.Business.Abstract;

import LayerDemo.Entities.Concretes.Campaign;
import LayerDemo.Entities.Concretes.Game;
import LayerDemo.Entities.Concretes.Users;

public interface IGameSaleService {
	void sale(Game game, Users user);
	
	void sale(Game game, Users user, Campaign campaign);

}
