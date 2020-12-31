package com.xx.rose.jade.demo.bean;

import java.io.Serializable;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 11:49
 * @since
 */
public class User implements Serializable {
    private int id;
    private int account;
    private String password;

    public User() {
    }

    public User(int id, int account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account=" + account +
                ", password='" + password + '\'' +
                '}';
    }
}
