package pl.wwsis.microblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name ="follower")
public class follower {
	@Id
	@GeneratedValue
	@Column(name="id", nullable=false)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "id")
	@Column(name = "follower_id")
	private user follower;
	
	@OneToOne
	@JoinColumn(name = "id")
	@Column(name = "followed_id")
	private user followed;

}
