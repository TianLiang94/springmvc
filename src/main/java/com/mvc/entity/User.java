package com.mvc.entity;


import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * @author tl
 * @date 2020/11/25
 */


public class User {
    private Integer id;
    private String name;
    private Boolean gender;
    private Date birth;
    private List<String> hobby;

    public User(Integer id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public User(Integer id, String name, Boolean gender, Date birth, List<String> hobby) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hobby = hobby;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", hobby=" + hobby +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
