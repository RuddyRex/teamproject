package com.ruddyrex.teamproject.RuddyRex.dao;

import java.util.List;

import com.ruddyrex.teamproject.RuddyRex.Model.Followers;


public interface FollowerDao {
	public void addFollower(int followerId, int followedId);
	public void unFollow(int followerId, int unfollowedId);
	public List<Followers> checkingFollowerList(int followedId);
}