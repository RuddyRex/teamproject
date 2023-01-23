package pl.wwsis.microblog.dao;

import java.util.List;
import pl.wwsis.microblog.model.post;
public interface PostDao {
	
	public List<post> getUserPosts(int user_id);
	public List<post> getMyAndFollowedPosts(int user_id);
	public List<post> getAllPosts();
	public void createPost(int user_id, String content);
	
}
