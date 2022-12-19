package LayerDemo.Business.Concretes;

import java.util.List;

import LayerDemo.Business.Abstract.IUsersService;
import LayerDemo.Core.MernisValidationService;
import LayerDemo.DataAccess.Concretes.UserDao;
import LayerDemo.Entities.Concretes.Users;

public class UserManager implements IUsersService {
	UserDao userDao;
	MernisValidationService managerService;
	

	public UserManager(UserDao userDao, MernisValidationService validationService) {
		super();
		this.userDao = userDao;
		this.managerService = validationService;
	}

	@Override
	public void add(Users user) {
		if(managerService.ifCheckRealUser(user.getIdentityNumber(), user.getName(), user.getSurName(), user.getBirthDate())) {
			System.out.println("Kullanıcı Doğrulandı");
			userDao.add(user);
			
		}
		else
		{
			System.out.println("Hatalı kullanıcı bilgileri");
		}
		
		
	}

	@Override
	public void update(Users user, int id) {
		userDao.update(user, id);
		
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
		
	}

	@Override
	public List<Users> get() {
		
		return null;
	}

}
