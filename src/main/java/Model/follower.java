package Model;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "follower")

public class follower {
	
	@Column(name = "id")
	private int id;
	@Column(name = "follower_id")
	private String follower_id;
	@Column(name = "followed_id")
	private String followed_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFollower_id() {
		return follower_id;
	}
	public void setFollower_id(String follower_id) {
		this.follower_id = follower_id;
	}
	public String getFollowed_id() {
		return followed_id;
	}
	public void setFollowed_id(String followed_id) {
		this.followed_id = followed_id;
	}
	
	
	
	
	
}
