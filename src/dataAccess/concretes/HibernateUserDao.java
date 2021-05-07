package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Sisteme kaydınız gerçekleşti \n\n"+ 
	user.getLastName().toUpperCase()+" "+user.getName().toUpperCase());
		
	}


	@Override
	public void logIn(User user) {
		System.out.println("Login gerçekleşti "+ user.getName()+" "+user.getLastName());
		
	}

}
