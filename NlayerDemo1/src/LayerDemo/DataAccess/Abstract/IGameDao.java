package LayerDemo.DataAccess.Abstract;

import java.util.List;

import LayerDemo.Entities.Concretes.Game;

public interface IGameDao {
	void add(Game game);

	void update(Game game, int id);

	void delete(int id);

	List<Game> get();

}
