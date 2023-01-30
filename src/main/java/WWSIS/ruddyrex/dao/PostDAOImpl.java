package WWSIS.ruddyrex.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

import WWSIS.ruddyrex.model.Post;


@Transactional
public class PostDAOImpl implements PostDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Post> getAllUsersPosts(int userID)
    {
        String hql="SELECT * FROM post WHERE user_id = "+userID;
		Query query=entityManager.createQuery(hql);
        List<Post> posts = query.getResultList();
        return posts;
    }

    @Override
    public List<Post> getAllUserAndFollowersPosts(int userID)
    {
        String hql="SELECT content FROM post P, follower F WHERE P.user_id=F.follower_id OR P.user_id = "+userID;
		Query query=entityManager.createQuery(hql);
        List<Post> posts = query.getResultList();
        return posts;
    }

    @Override
    public List<Post> getEveryPost()
    {
        String hql="SELECT content FROM post";
		Query query=entityManager.createQuery(hql);
        List<Post> posts = query.getResultList();
        return posts;
    }

    @Override
    public void createNewPost(int userID, String content)
    {
        String hql="INSERT INTO post(userID,content) VALUES(:userID, :content)";
		Query query=entityManager.createQuery(hql);
        query.setParameter("userID", userID);
        query.setParameter("content", content);
        query.executeUpdate();
    }
}