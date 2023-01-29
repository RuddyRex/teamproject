package com.ruddyrex.teamproject.RuddyRex.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.User;
import com.ruddyrex.teamproject.RuddyRex.dao.UserDao;

@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public User findUserById(int id) {
		String qlString = "SELECT * FROM users" + " u WHERE u." + id + " = " + id;
		Query query = entityManager.createQuery(qlString);
		query.setParameter("id", id);
		List<User> users = query.getResultList();

		return users.get(0);
	}

	@Override
	public User findUserByNickname(String nickname) {
		String hql = "SELECT * FROM user WHERE nickname = " + nickname;
		Query query = entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> results = query.getResultList();
		return results.get(0);
	}

	@Override
	public void createUser(User User) {
		entityManager.persist(User);
	}

	private boolean loginFailed(String user) {
		return user == null || user.isEmpty();
	}

	public User getUserById(int id) {
		String hql = "SELECT * FROM users WHERE id = " + id;
		Query query = entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> results = query.getResultList();
		return results.get(0);
	}
}