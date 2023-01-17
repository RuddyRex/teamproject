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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Timestamp getDate() {
		return Date;
	}
	public void setDate(Timestamp date) {
		Date = date;
	}
	public int getId() {
		return id;
	}

}
