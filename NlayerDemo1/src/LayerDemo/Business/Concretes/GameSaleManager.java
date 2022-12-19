package LayerDemo.Business.Concretes;

import LayerDemo.Business.Abstract.IGameSaleService;
import LayerDemo.Entities.Concretes.Campaign;
import LayerDemo.Entities.Concretes.Game;
import LayerDemo.Entities.Concretes.Users;

public class GameSaleManager implements IGameSaleService {

	@Override
	public void sale(Game game, Users user) {
		System.out.println(game.getGameName() + "/tOyun satışı yapıldı"+ "Satış yapan oyuncu : " + user.getName());
		
	}

	@Override
	public void sale(Game game, Users user, Campaign campaign) {
		System.out.println(game.getGameName() + "/t Oyun satışı yapıldı"+ "Satış yapan oyuncu : " + user.getName() + "Kampanya Oranı : " + campaign.getDiscount() );
		 
	}

}
