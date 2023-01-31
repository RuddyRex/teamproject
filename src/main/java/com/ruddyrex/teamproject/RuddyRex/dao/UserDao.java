package com.ruddyrex.teamproject.RuddyRex.dao;

import com.ruddyrex.teamproject.RuddyRex.Model.User;

public interface UserDao{
	public User findUserById(int id);
	public User findUserByNickname(String nickname);
	public void createUser(User User);
}