package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Sisteme kayd�n�z ger�ekle�ti \n\n"+ 
	user.getLastName().toUpperCase()+" "+user.getName().toUpperCase());
		
	}

	@Override
	public void getUser(User user) {
		// TODO Auto-generated method stub
		
	}

}