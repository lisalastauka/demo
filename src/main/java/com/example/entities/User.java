package com.example.entities;

import javax.persistence.*;

@Entity
public class User {

    public User(){
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "ID")
    private long id;
    private String username;
    private String password;
    private String email;
    private Boolean role;

    public long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }
}
