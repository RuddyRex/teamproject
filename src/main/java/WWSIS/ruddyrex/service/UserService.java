package WWSIS.ruddyrex.service;

import WWSIS.ruddyrex.model.User;

public interface UserService {

	public User getUserByLogin(String login);

	public void addNewUser(User user);
}
