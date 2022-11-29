package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> post;

    public User(){};

    public User(long id, String username, String email, String password, List<Post> post) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.post = post;
    }

    public User(User user) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public CharSequence getPassword() {
        return null;
    }

    public void setPassword(String hash) {
    }
}
