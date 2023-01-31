package com.ruddyrex.teamproject.RuddyRex.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ruddyrex.teamproject.RuddyRex.Model.Post;
import com.ruddyrex.teamproject.RuddyRex.dao.PostDao;

@Transactional
public class PostDaoImpl implements PostDao{
    @PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Post> getUserPosts(int user_id) {
		String hql="SELECT * FROM post WHERE user_id = "+user_id;
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Post> results = query.getResultList();
		return results;
	}

	@Override
	public List<Post> getMyAndFollowedPosts(int user_id) {
		String hql="SELECT content FROM post P, follower F WHERE P.user_id=F.follower_id OR P.user_id = "+user_id;
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Post> results = query.getResultList();
		return results;
	}

	@Override
	public List<Post> getAllPosts() {
		String hql="SELECT content FROM post";
		Query query=entityManager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Post> results = query.getResultList();
		return results;
	}

	@Override
	public void createPost(int user_id, String content) {
		String hql="INSERT INTO post(user_id,content) VALUES(:user_id, :content)";
		Query query=entityManager.createQuery(hql);
		query.setParameter("user_id", user_id);
		query.setParameter("content", content);
		query.executeUpdate();	
	}
    
}