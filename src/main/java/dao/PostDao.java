package dao;

import java.util.List;

import Model.post;

public interface PostDao {
	
	void insert(post a);
	
	void update(post a);
	
	void delete(post a);
	
	post getById(int id);
	
		
	List<post> getAll();
	
	

}
