package com.ruddyrex.teamproject.RuddyRex;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.Post;
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

	/*
	 * @Test public void shouldCreatePost() { Post testPost = setPostData();
	 * 
	 * assertEquals(testPost, null); }
	 */

}
