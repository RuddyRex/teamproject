package com.ruddyrex.teamproject.RuddyRex.dao;

import java.util.List;

import com.ruddyrex.teamproject.RuddyRex.Model.Post;

public interface PostDao {
	
	public List<Post> getUserPosts(int user_id);
	public List<Post> getMyAndFollowedPosts(int user_id);
	public List<Post> getAllPosts();
	public void createPost(int user_id, String content);
	
}