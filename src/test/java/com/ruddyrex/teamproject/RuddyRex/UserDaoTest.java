package com.ruddyrex.teamproject.RuddyRex;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.model.user;
import pl.wwsis.microblog.dao.UserDao;
import pl.wwsis.microblog.dao.impl.UserDaoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
	public String testPass = "password";	
	public String nullString = null;
	public String emptyString = "";
	
	@Before
	public void buildUp() {
		userDao = new UserDaoImpl();
	}
	
	public user setUserData() {
		user testUser = new user();
		testUser.setFirstName(testName);
		testUser.setPassword(testPass);
		return testUser;
	}
	
	@Test
	public void shouldFindUserById() {
		user user = setUserData();
		userDao.createUser(user);
		
		user testUser = userDao.getUserLogin(1);
		assertEquals(user,testUser);
	}