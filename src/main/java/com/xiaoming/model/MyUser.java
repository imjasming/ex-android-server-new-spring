package com.xiaoming.model;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nickName;
    private String password;
    private String email;

    public MyUser(){}

    public MyUser(Integer id, String password){
        this.id = id;
        this.password = password;
    }

    public MyUser(Integer id, String nickName, String password, String email){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.email = email;
    }

    public Integer getUUID() {
        return id;
    }

    public void setUUID(Integer id) {
        id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NonNull
    @Override
    public String toString() {
        return nickName;
    }
}
