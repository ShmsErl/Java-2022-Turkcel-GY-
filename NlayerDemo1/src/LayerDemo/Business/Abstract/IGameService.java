package LayerDemo.Business.Abstract;

import java.util.List;

import LayerDemo.Entities.Concretes.Game;

public interface IGameService {
	void add(Game game);

	void update(Game game, int id);

	void delete(int id);

	List<Game> get();

}
