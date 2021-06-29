package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long id;

    @Column(name="EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name="PASSWORD", unique = true, nullable = false)
    private String password;

    @Column (name = "STATUS",nullable = false)
    private boolean isActivated; // ou enabled

    @ManyToOne
    @JoinColumn (name="ROLE_CODE", nullable = false)
    private UserRole role;


    public UserAccount(){
        //
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {
        this.email = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public UserRole getRole() {
        return role;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Account [id=" + getId() + ", email=" + email
                + ", password=PROTECTED, enabled=" + isActivated + ", role=" + role
                + "]";
    }
}

