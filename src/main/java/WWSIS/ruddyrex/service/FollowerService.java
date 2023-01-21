package WWSIS.ruddyrex.service;


import WWSIS.ruddyrex.model.Follower;

import java.util.List;

public interface FollowerService {
    List<Follower> getFollowersByUserId(int userId);

    void follow(int followedUserId, int followerUserId);

    void unfollow(int followedUserId, int followerUserId);
}