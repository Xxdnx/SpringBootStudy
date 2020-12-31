package com.xx.kafka.demo.bean;

import java.io.Serializable;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 21:25
 * @since
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String sex;

    public User() {
    }

    public User(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
