package entities;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

import java.util.Date;
import java.util.Objects;

@Entity(name = "users")
public class User {
    @Id
    @Column(name = "id", columnDefinition = "")
    private long id;

    @Column(name = "username", columnDefinition = "")
    private String username;

    @Column(name = "age", columnDefinition = "")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}