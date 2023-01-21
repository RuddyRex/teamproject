package WWSIS.ruddyrex.dao;

import WWSIS.ruddyrex.model.Follower;
import WWSIS.ruddyrex.model.User;

public class FollowerDAOImpl implements FollowerDAO {
    @Override
    public void add(int followedId, int followerId) {
        // TODO
    }

    @Override
    public void remove(int followedId, int followerId) {
        // TODO
    }

    @Override
    public Follower getByFollowedId(int followedId) {
        return new Follower();
    }
}
