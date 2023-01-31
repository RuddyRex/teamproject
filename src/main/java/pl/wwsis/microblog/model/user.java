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

		public void setFirstName(String firstName) {
			// TODO Auto-generated method stub
			this.firstName = firstName;
		}
		public void setLastName(String last_name) {
			// TODO Auto-generated method stub
			this.last_name = last_name;
		}
		public void setPassword(String pass) {
			// TODO Auto-generated method stub
			this.pass = pass;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}

}
