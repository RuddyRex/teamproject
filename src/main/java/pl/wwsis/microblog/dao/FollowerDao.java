package pl.wwsis.microblog.dao;

import java.util.List;

import pl.wwsis.microblog.model.follower;


public interface FollowerDao {
	public void addFollower(int followerId, int followedId);
	public void unFollow(int followerId, int unfollowedId);
	public List<follower> checkingFollowerList(int followedId);
}
