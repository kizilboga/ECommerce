import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user=new User();
user.setName("id");
user.setLastName("kzil");
user.setEmail("derler@gmail.com");
user.setParola("123456");

UserService userservice=new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());

userservice.register(user);
userservice.logIn(user);

	}

}
