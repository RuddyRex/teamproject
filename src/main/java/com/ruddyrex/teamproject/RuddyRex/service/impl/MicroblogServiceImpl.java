package com.ruddyrex.teamproject.RuddyRex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.Model.Post;
import com.ruddyrex.teamproject.RuddyRex.dao.FollowerDao;
import com.ruddyrex.teamproject.RuddyRex.dao.PostDao;
import com.ruddyrex.teamproject.RuddyRex.dao.UserDao;
import com.ruddyrex.teamproject.RuddyRex.service.MicroblogService;

public class MicroblogServiceImpl implements MicroblogService{
    @Autowired
    UserDao UserDAO;
    @Autowired
    FollowerDao FollowerDAO;
    @Autowired
    PostDao PostDAO;

    @Override
    public List<Post> getAllPostsFromUser(User User) {
        return PostDAO.getUserPosts(User.getId());
    }
}