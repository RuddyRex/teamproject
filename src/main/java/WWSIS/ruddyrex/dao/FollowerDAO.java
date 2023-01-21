package WWSIS.ruddyrex.dao;

import WWSIS.ruddyrex.model.Follower;

public interface FollowerDAO {
    void add(int followedId, int followerId);

    void remove(int followedId, int followerId);

    Follower getByFollowedId(int followedId);
}