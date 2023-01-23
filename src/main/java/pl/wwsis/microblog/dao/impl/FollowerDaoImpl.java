package pl.wwsis.microblog.dao.impl;

import java.util.List;

import javax.persistence.Query;

import pl.wwsis.microblog.dao.FollowerDao;
import pl.wwsis.microblog.model.follower;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FollowerDaoImpl implements FollowerDao{
    @PersistenceContext
    EntityManager entityManager;
	@Override
	public void addFollower(int followerId, int followedId) {
		String hql="INSERT INTO follower(follower_id,followed_id) VALUES(:followerId, :followedId)";
		Query query=entityManager.createQuery(hql);
		query.setParameter("followerId", followerId);
		query.setParameter("followedId", followedId);
		query.executeUpdate();
		
	}

	@Override
	public void unFollow(int followerId, int unfollowedId) {
		String hql="DELETE FROM follower WHERE follower_id=:follower_id AND unfollowed_id=:unfollowed_id";
		Query query=entityManager.createQuery(hql);
		query.setParameter("follower_id", followerId);
		query.setParameter("unfollowed_id", unfollowedId);
		query.executeUpdate();
		
	}

	@Override
	public List<follower> checkingFollowerList(int followedId) {
		String hql="SELECT * FROM follower WHERE followed_id=:followed_id";
		Query query=entityManager.createQuery(hql);
		query.setParameter("followed_id", followedId);
		@SuppressWarnings("unchecked")
		List<follower> results = query.getResultList();
		return results;
	}

}
