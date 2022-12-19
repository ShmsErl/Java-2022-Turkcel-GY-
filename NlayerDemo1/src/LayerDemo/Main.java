package LayerDemo;

import LayerDemo.Business.Abstract.ICampaignService;
import LayerDemo.Business.Abstract.IGameSaleService;
import LayerDemo.Business.Abstract.IUsersService;
import LayerDemo.Business.Concretes.CampaignManager;
import LayerDemo.Business.Concretes.GameSaleManager;
import LayerDemo.Business.Concretes.UserManager;
import LayerDemo.Core.MernisValidationManagerAdapter;
import LayerDemo.DataAccess.Concretes.CampaignDao;
import LayerDemo.DataAccess.Concretes.UserDao;
import LayerDemo.Entities.Concretes.Campaign;
import LayerDemo.Entities.Concretes.Game;
import LayerDemo.Entities.Concretes.Users;

public class Main {

	public static void main(String[] args) {
		
		
		IUsersService iUsersService = new UserManager(new UserDao(), new MernisValidationManagerAdapter());
		Users user = new Users(1, "Şeyhmus", "Erol", "123", "1999-08-01");
		iUsersService.add(user);
		user.setName("Ahmet");
		
		iUsersService.update(user, 1);
		
		ICampaignService campaignService= new CampaignManager(new CampaignDao());
		Campaign campaign = new Campaign(1,"Oyunİndirimi", 0.50);
		campaignService.add(campaign);
		
		IGameSaleService gameSaleService = new GameSaleManager();
		Game game = new Game(1,"Minecraft", 1500 );
		gameSaleService.sale(game, user);
		game.setUnitPrice(750);
		gameSaleService.sale(game, user, campaign);

	}

}
