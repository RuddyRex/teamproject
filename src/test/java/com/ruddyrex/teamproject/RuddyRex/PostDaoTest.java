package com.ruddyrex.teamproject.RuddyRex;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Rollback(true)
public class PostDaoTest {

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
		postDao = new PostDaoImpl();
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
	
	@Test
	public void shouldCreatePost() {
		User user = setUserData();
		Post post = setPostData();
		
		postDao.createPost(user.getId(), post.getDescription());
		assertNotNull(post);
	}
	
	@Test
	public void shouldReturnAllPost() {
		User user = setUserData();
		Post post = setPostData();
		Post post2 = setPostData();
		
		postDao.createPost(user.getId(), post.getDescription());
		postDao.createPost(user.getId(), post2.getDescription());
		
		List<Post> allPosts = postDao.getAllPosts();
		assertTrue(allPosts.size() > 1);
	}
	
	@Test
	public void shouldReturnUserPosts() {
		User user = setUserData();
		Post post = setPostData();
		
		postDao.createPost(user.getId(), post.getDescription());
		List<Post> userPosts = postDao.getUserPosts(user.getId());
		assertNotNull(userPosts);
	}
}
