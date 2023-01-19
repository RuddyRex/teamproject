package Model;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "post")
public class post {
		@Column(name = "id")
		private int id;
		@Column(name = "user_id")
		private String user_id;
		@Column(name = "content")
		private String content;
		@Column(name = "creation_date")
		private Timestamp Date;
		@Column(name = "is_public")
		private boolean is_public;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Timestamp getDate() {
			return Date;
		}
		public void setDate(Timestamp date) {
			Date = date;
		}
		public boolean isIs_public() {
			return is_public;
		}
		public void setIs_public(boolean is_public) {
			this.is_public = is_public;
		}
		
		

}
