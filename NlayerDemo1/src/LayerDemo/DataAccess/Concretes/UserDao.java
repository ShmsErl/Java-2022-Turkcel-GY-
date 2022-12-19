package LayerDemo.DataAccess.Concretes;

import java.util.List;

import LayerDemo.DataAccess.Abstract.IUserDao;
import LayerDemo.Entities.Concretes.Users;

public class UserDao implements IUserDao {

	@Override
	public void add(Users user) {
		System.out.println("Veri Tabanına Yeni Kullanıcı Eklendi " + user.getName());
		
	}

	@Override
	public void update(Users user, int id) {
		System.out.println("Veri Tabanında " + id+"Kullanıcı : "+ user.getName()+ "Güncllendi");
		
	}

	@Override
	public void delete(int id) {
		System.out.println("Veri Tabanından silindi" + id );
		
	}

	@Override
	public List<Users> get() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
