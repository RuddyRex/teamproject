package com.ruddyrex.teamproject.RuddyRex;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruddyrex.teamproject.RuddyRex.Model.Followers;
import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.FollowerDao;
import com.ruddyrex.teamproject.RuddyRex.dao.impl.FollowerDaoImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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

	public User setUserData() {
		User testUser = new User();
		testUser.setName(testName);
		testUser.setNickname(testNickname);
		testUser.setPassword(testPass);
		testUser.setMail(testMail);
		return testUser;
	}

	@Test
	public void shouldFollow() {
		User user = setUserData();
		User user1 = setUserData();
		followerDao.addFollower(user.getId(), user1.getId());

		List<Followers> followers = followerDao.checkingFollowerList(user1.getId());
		assertNotNull(followers);
	}

	@Test
	public void shouldUnfollow() {
		User user = setUserData();
		User user1 = setUserData();

		followerDao.addFollower(user.getId(), user1.getId());
		followerDao.unFollow(user.getId(), user1.getId());

		List<Followers> followers = followerDao.checkingFollowerList(user1.getId());
		assertNull(followers);
	}

	@Test
	public void shouldGetAllFollowers() {
		User user = setUserData();
		User user1 = setUserData();
		User user2 = setUserData();

		followerDao.addFollower(user.getId(), user1.getId());
		followerDao.addFollower(user.getId(), user2.getId());

		assertNotNull(null);
	}
}
