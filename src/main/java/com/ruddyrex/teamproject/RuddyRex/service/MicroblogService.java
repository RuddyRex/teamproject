package com.ruddyrex.teamproject.RuddyRex.service;

import com.ruddyrex.teamproject.RuddyRex.Model.User;

import java.util.List;

import com.ruddyrex.teamproject.RuddyRex.Model.Post;


public interface MicroblogService {
	List<Post> getAllPostsFromUser(User User);
	
}