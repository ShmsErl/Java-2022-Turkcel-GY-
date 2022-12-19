package LayerDemo.Business.Concretes;

import java.util.List;

import LayerDemo.Business.Abstract.IGameService;
import LayerDemo.DataAccess.Abstract.IGameDao;
import LayerDemo.Entities.Concretes.Game;

public class GameManager implements IGameService {
	IGameDao gameDao;

	public GameManager(IGameDao gameDao) {
		
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Override
	public void update(Game game, int id) {
		gameDao.update(game, id);
		
	}

	@Override
	public void delete(int id) {
		gameDao.delete(id);
		
	}

	@Override
	public List<Game> get() {
		
		return null;
	}
	

}
