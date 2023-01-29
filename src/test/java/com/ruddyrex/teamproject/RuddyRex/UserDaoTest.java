package com.ruddyrex.teamproject.RuddyRex;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.UserDao;
import com.ruddyrex.teamproject.RuddyRex.dao.impl.UserDaoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)
public class UserDaoTest {
    
	@Autowired
	UserDao userDao;
	
	public String testName = "name and surname";
	public String testNickname = "nickname";
	public String testPass = "password";	
	public String testMail = "mail";
	public String nullString = null;
	public String emptyString = "";
	
	@Before
	public void buildUp() {
		userDao = new UserDaoImpl();
	}
	
	public User setUserData() {
		User testUser = new User();
		testUser.setName(testName);
		testUser.setNickname(testNickname);
		testUser.setPassword(testPass);
		testUser.setMail(testMail);
		return testUser;
	}
	
	@Test
	public void shouldFindUserById() {
		User user = setUserData();
		userDao.createUser(user);
		
		User testUser = userDao.findUserById(1);
		assertEquals(user,testUser);
	}
	
	/*@Test
	public void shouldFindUserByNickname() {
		User user = setUserData();
		userDao.createUser(user);
		
		User testUser = userDao.findUserByNickname(user.getNickname());
		assertEquals(user,testUser);
	}
	
	
	@Test
	public void shouldNotFindUserWithNullNickname() {
		User user = userDao.findUserByNickname(null);
		assertNull(user);
	}
	
	@Test
	public void shouldCreateUser() {
		User user = new User();
		user.setName(testName);
		user.setNickname(testNickname);
		user.setPassword(testPass);
		user.setMail(testMail);
		assertNotNull(user);
	}
	
	
	 * @Test public void getUserTrue() { 
	 * User getUser = getUserData();
	 * UserDaoImpl.createUser(getUser); 
	 * }
	 */
}
