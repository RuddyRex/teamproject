package pl.wwsis.microblog.dao;
import pl.wwsis.microblog.model.user;

public interface UserDao {
	public user getUserLogin(int id);
	public void createUser(user User);
}
