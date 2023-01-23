package pl.wwsis.microblog.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import pl.wwsis.microblog.dao.UserDao;
import pl.wwsis.microblog.model.user;

@Transactional
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public user getUserLogin(int id) {
		String hql="SELECT * FROM user WHERE id = "+id;
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<user> results =query.getResultList();
		return results.get(0);
	}
	
	@Override
	public void createUser(user User) {
		entityManager.persist(User);
	}
}
