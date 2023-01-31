package com.ruddyrex.teamproject.RuddyRex;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.Post;
import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.PostDao;
import com.ruddyrex.teamproject.RuddyRex.dao.impl.PostDaoImpl;
import com.ruddyrex.teamproject.RuddyRex.service.MicroblogService;
import com.ruddyrex.teamproject.RuddyRex.service.impl.MicroblogServiceImpl;

import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)
public class MicroblogServiceTest {
	
	@Autowired
	MicroblogService microservice;
	
	@Autowired
	PostDao postDao;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public String title = "Test Title";
	public String description = "Test Description";
	public Date date = new Date();
	
	public String testName = "name and surname";
	public String testNickname = "nickname";
	public String testPass = "password";	
	public String testMail = "mail";
	
	
	@Before
	public void buildUp() {
		microservice = new MicroblogServiceImpl();
		postDao = new PostDaoImpl();
	}
	
	@Test
	public void shouldReturnAllPosts() {
		User user = setUserData();
		Post post = setPostData();
		Post post2 = setPostData();
		
		postDao.createPost(user.getId(), post.getDescription());
		postDao.createPost(user.getId(), post2.getDescription());
		
		assertNotNull(microservice.getAllPostsFromUser(user));
	}
	
	public Post setPostData() {
		Post post = new Post();
		post.setTitle(title);
		post.setDescription(description);
		post.setCreated_at(date);
		return post;
	}
	
	public User setUserData() {
		User testUser = new User();
		testUser.setName(testName);
		testUser.setNickname(testNickname);
		testUser.setPassword(testPass);
		testUser.setMail(testMail);
		return testUser;
	}
}
