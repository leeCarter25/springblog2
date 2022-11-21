package models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

public class Post {
    private long id;
    private String title;
    private String body;

    public Post(){};

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Entity
    @Table(name = "employee")
    public class Employee implements Serializable {

        @Column(name = "employee_name")
        private String employeeName;
        @Id
        private Long id;

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }
    }
}
