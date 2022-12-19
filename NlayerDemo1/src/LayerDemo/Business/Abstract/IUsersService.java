package LayerDemo.Business.Abstract;

import java.util.List;

import LayerDemo.Entities.Concretes.Users;

public interface IUsersService {
	void add(Users user);

	void update(Users user, int id);

	void delete(int id);

	List<Users> get();

}
