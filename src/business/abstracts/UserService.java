package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void register(User user);

	void getUser(User user);
	void sendMessage(String message);
	void registerSuccess();
	void registerFail();
}
