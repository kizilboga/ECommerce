package entities.concretes;

import EmailPackage.JavaEmailPackage;
import entities.abstracts.Entity;

public class User implements Entity {

	private String name;
	private String lastName;
	private String email;
	private String parola;

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
			this.name = name;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
			this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
			this.email = email;
	

	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
			this.parola = parola;
	

	}

}
