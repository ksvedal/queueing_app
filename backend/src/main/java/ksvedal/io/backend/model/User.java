package ksvedal.io.backend.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "authorization_level", nullable = false)
    private Long authorization_level;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public User(Long id, Long authorization_level, String username, String password) {
        this.id = id;
        this.authorization_level = authorization_level;
        this.username = username;
        this.password = password;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorization_level() {
        return authorization_level;
    }

    public void setAuthorization_level(Long authorization_level) {
        this.authorization_level = authorization_level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
