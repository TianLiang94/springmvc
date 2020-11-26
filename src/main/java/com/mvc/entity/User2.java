package com.mvc.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.mvc.serialize.MySerializer2;

import java.util.Date;

public class User2 {
    @JSONField(serialize = false)
    private Integer id;
    @JSONField(name="NAME",serialzeFeatures = SerializerFeature.WriteNullStringAsEmpty)
    private String name;// ""
    @JSONField(serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String city;// null
    @JSONField(format="yyyy/MM/dd")
    private Date birth;
    @JSONField(serializeUsing = MySerializer2.class)
    private Double salary; // 元

    public User2(){}
    public User2(Integer id, String name, String city, Date birth, Double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.birth = birth;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", birth=" + birth +
                ", salary=" + salary +
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
