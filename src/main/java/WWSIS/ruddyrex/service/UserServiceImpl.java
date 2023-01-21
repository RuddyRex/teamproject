package WWSIS.ruddyrex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WWSIS.ruddyrex.dao.UserDAO;
import WWSIS.ruddyrex.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;

	@Override
	public User getUserByLogin(String login) {
		return dao.getUserByLogin(login);
	}

	@Override
	public void addNewUser(User user) {
		dao.addNewUser(user);
	}
}
