package WWSIS.Microblog.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.dao.impl.UserDaoImpl;
import pl.wwsis.microblog.model.user;

class TestUserDaoImpl {
	public String testName = "test name";
	public String testSurname = "test surname";
	public String testPass = "test password";
	
	@Before
	public void buildUp() {
		UserDaoImpl userDao = new UserDaoImpl();
	}
	private user getUserData() {
		user testUser = new user();
		testUser.setFirstName(testName);
		testUser.setLastName(testSurname);
		testUser.setPassword(testPass);
		return testUser;
	}
	@Test
	public void getUserTrue() {
		user getUser = getUserData();
//		UserDaoImpl.createUser(getUser);
	}


}
