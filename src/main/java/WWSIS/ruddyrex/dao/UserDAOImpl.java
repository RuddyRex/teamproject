package WWSIS.ruddyrex.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import WWSIS.ruddyrex.model.User;

@Transactional
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public User getUserLogin (int id) {
		String hql="SELECT * FROM user WHERE id = "+id;
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> results =query.getResultList();
		return results.get(0);
	}
	
	@Override
	public void addNewUser(User user) {
		entityManager.persist(user);
	}

}
