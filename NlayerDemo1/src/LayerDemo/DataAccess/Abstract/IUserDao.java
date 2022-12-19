package LayerDemo.DataAccess.Abstract;

import java.util.List;


import LayerDemo.Entities.Concretes.Users;

public interface IUserDao {
	void add(Users user);

	void update(Users user, int id);

	void delete(int id);

	List<Users> get();

}
