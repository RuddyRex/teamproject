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
		@Column(name = "title")
		private String title;
		@Column(name = "content")
		private String content;
		@Column(name = "created_at")
		private Timestamp Date;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		public int getId() {
			return id;
		}

}
