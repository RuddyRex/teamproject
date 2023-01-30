package WWSIS.ruddyrex.dao;

import java.util.List;

import WWSIS.ruddyrex.model.Follower;

public interface FollowerDAO {
    public void addFollower(int followerId, int followedId);
	public void unFollow(int followerId, int unfollowedId);
	public List<Follower> checkingFollowerList(int followedId);
}