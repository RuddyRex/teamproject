package microblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import pl.wwsis.microblog.dao.UserDao;
import pl.wwsis.microblog.dao.FollowerDao;
import pl.wwsis.microblog.dao.PostDao;
import microblog.service.MicroblogService;
import pl.wwsis.microblog.model.post;
import pl.wwsis.microblog.model.user;

public class MicroblogServiceImpl implements MicroblogService{
    @Autowired
    UserDao UserDAO;
    @Autowired
    FollowerDao FollowerDAO;
    @Autowired
    PostDao PostDAO;

    @Override
    public List<post> getAllPostsFromUser(user User) {
        return PostDAO.getUserPosts(User.getId());
    }
}
