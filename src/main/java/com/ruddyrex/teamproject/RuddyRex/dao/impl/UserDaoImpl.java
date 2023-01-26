package com.ruddyrex.teamproject.RuddyRex.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.UserDao;

@Transactional
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public User getUserLogin(int id) {
		String hql="SELECT * FROM user WHERE id = "+id;
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> results =query.getResultList();
		return results.get(0);
	}

	@Override
	public void createUser(User User) {
		entityManager.persist(User);		
	}
	
	
}