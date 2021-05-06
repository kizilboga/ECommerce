package core;

import EmailPackage.GoogleEmail;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void register(String message) {
		GoogleEmail googleEmail=new GoogleEmail();
		googleEmail.googleMail("Selamlar Gakkko");
		
	}

	

}
