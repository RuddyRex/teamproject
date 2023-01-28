package WWSIS.ruddyrex.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import WWSIS.ruddyrex.dao.UserDAO;
import WWSIS.ruddyrex.dao.FollowerDAO;
import WWSIS.ruddyrex.dao.PostDAO;
import WWSIS.ruddyrex.model.Post;
import WWSIS.ruddyrex.model.User;
import WWSIS.ruddyrex.service.MicroblogService;


public class MicroblogServiceImpl implements MicroblogService {
    @Autowired    UserDAO UserDao;
    @Autowired    FollowerDAO FollowerDao;
    @Autowired    PostDAO PostDao;
    @Override    public List<Post> getAllPostsFromUser(User user) {
        return PostDao.getAllUsersPosts(user.getId());
    }
}


