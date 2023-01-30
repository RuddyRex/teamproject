package WWSIS.ruddyrex.dao;

import WWSIS.ruddyrex.model.User;

public interface UserDAO {

	public User getUserLogin(int id);
	
	public void addNewUser(User user);
}
