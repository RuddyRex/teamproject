package WWSIS.ruddyrex.dao;

import WWSIS.ruddyrex.model.User;

public interface UserDAO {

	public User getUserByLogin(String login);
	
	public void addNewUser(User user);
}
