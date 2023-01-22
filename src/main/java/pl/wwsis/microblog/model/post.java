package pl.wwsis.microblog.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="post")
public class post {
	@Id
	@GeneratedValue
	@Column(name="id", nullable=false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id")
	@Column(name = "user_id")
	private user user_id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "creation_date")
	private Date creation_date;
	
	@Column(name = "is_public")
	private boolean is_public;
	
}
