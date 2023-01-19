package dao;

import java.util.List;

import Model.user;

public interface UserDao {
	
	void insert(user a);
	
	void update(user a);
	
	void delete(user a);
	
	user get(String nick_name); 
	
		
	List<user> getAll();

}
