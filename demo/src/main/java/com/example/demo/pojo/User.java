package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
	
    String password;
    String username;
    String phone_number;
    String registration_time;
    String last_login_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }
    
    public String getRegistrationTime() {
        return registration_time;
    }

    public void setRegistrationTime(String registration_time) {
        this.registration_time = registration_time;
    }
    
    public String getLastLoginTime() {
        return last_login_time;
    }

    public void setLastLoginTime(String last_login_time) {
        this.last_login_time = last_login_time;
    }
}
