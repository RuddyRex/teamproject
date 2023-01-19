package dao;
import java.util.List;

import Model.follower;


public interface FollowerDao {
	
	void insert(follower a);
	
	void update(follower a);
	
	void delete(follower a);
	
	follower getById(int id);
	
		
	List<follower> getFollowers(int follower_id, int followed_id);
	
	follower input(int follower_id);
	
		
		
	

}
