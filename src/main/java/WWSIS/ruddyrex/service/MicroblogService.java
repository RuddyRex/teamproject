package WWSIS.ruddyrex.service;


import WWSIS.ruddyrex.model.User;
import WWSIS.ruddyrex.model.Post;
import java.util.List;



public interface MicroblogService {

    List<Post> getAllPostsFromUser(User user);

}