package com.ruddyrex.teamproject.RuddyRex;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.FollowerDao;
import com.ruddyrex.teamproject.RuddyRex.dao.impl.FollowerDaoImpl;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)
public class FollowerDaoTest {

	@Autowired
	FollowerDao followerDao;

	public String testName = "name and surname";
	public String testNickname = "nickname";
	public String testPass = "password";
	public String testMail = "mail";

	@Before
	public void buildUp() {
		followerDao = new FollowerDaoImpl();
	}

	/*
	 * @Test public void shouldFollow() {
	 * 
	 * }
	 * 
	 * @Test public void shouldUnfollow() {
	 * 
	 * }
	 * 
	 * @Test public void shouldGetAllFollowers() {
	 * 
	 * }
	 * 
	 * @Test public void shouldNotGetFollower() {
	 * 
	 * }
	 * 
	 * public User setUserData() { User testUser = new User();
	 * testUser.setName(testName); testUser.setNickname(testNickname);
	 * testUser.setPassword(testPass); testUser.setMail(testMail); return testUser;
	 * }
	 * 
	 * @Test public void shouldAnswerWithTrue() { assertTrue(true); }
	 */
}
