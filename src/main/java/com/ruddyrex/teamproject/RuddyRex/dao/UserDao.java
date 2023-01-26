package com.ruddyrex.teamproject.RuddyRex.dao;

import com.ruddyrex.teamproject.RuddyRex.Model.User;

public interface UserDao{
	public User getUserLogin(int id);
	public void createUser(User User);
}