package business.concretes;

import EmailPackage.JavaEmailPackage;
import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
private UserDao userDao;
private GoogleService googleService;



	
	public UserManager(UserDao userDao,GoogleService googleService ) {
	super();
	this.userDao = userDao;
	this.googleService=googleService;
}

	@Override
	public void register(User user) {
		
		JavaEmailPackage emailPack = new JavaEmailPackage();
		
		if (user.getEmail().equals("derler@gmail.com")) {
			System.out.println("Bu mail zaten kullanýlmaktadýr!");
			this.registerFail();
			return;
			
		}else if(!emailPack.isValidEmailAddress(user.getEmail())) {
			System.out.println("Email yanlýþ girilmiþtir!");
			this.registerFail();
			return;
		}
			
			else if (user.getName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ýsim veya soyad en az 2 karakter olmalýdýr!");
			this.registerFail();
			return;
		}
	
	else if (user.getParola().length()<6) {
			System.out.println("Parola en az 6 karakter olmalýdýr");
			this.registerFail();
			return;
		}
		
		this.userDao.add(user);
		this.googleService.register("Welcome");
		this.sendMessage(user.getEmail());
		this.registerSuccess();
		
		
	}

	@Override
	public void getUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Lütfen Epostanýzý doðrulayýn!"+ message);
		
		
	}

	@Override
	public void registerSuccess() {
		System.out.println("You are Registered!");
		
	}

	@Override
	public void registerFail() {
		System.out.println("You are not registered!");
		
	}

	@Override
	public void logIn(User user) {
		if (user.getEmail().equals("derler@gmail.com")&& user.getParola().equals("123456")) {
			System.out.println("You are logged in!");
		}else {
			System.out.println("You are not logged in!");
			return;
		}
		
	}

}
