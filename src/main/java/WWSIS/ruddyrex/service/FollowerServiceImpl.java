package WWSIS.ruddyrex.service;

import WWSIS.ruddyrex.dao.FollowerDAO;
import WWSIS.ruddyrex.model.Follower;

import java.util.List;

public class FollowerServiceImpl implements FollowerService {
    private FollowerDAO followerDAO;

    public FollowerServiceImpl(FollowerDAO followerDao) {
        this.followerDAO = followerDao;
    }

    @Override
    public List<Follower> getFollowersByUserId(int userId) {
        return null;
    }

    @Override
    public void follow(int followedUserId, int followerUserId) {
        followerDAO.add(followedUserId, followerUserId);
    }

    @Override
    public void unfollow(int followedUserId, int followerUserId) {
        followerDAO.remove(followedUserId, followerUserId);
    }
}