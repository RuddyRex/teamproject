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
	@Column(name = "name")
	private String name;
	@Column(name = "alias")
	private String alias;
	@Column(name = "role")
	private String role;
	@Column(name = "created_at")
	private Timestamp Date;

}
