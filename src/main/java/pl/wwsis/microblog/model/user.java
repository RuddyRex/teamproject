package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="user")
public class user {

		@Id
		@GeneratedValue
		@Column(name="id", nullable=false)
		private Integer id;
		
		@Column(name = "first_name")
		private String firstName;
		
		@Column(name = "last_name")
		private String last_name;
		
		@Column(name = "pass")
		private String pass;

}
