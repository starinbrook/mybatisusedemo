package com.zhuyca.kkb.entity;

/**
 * @Title :
 * @Program :       mybatisusedemo
 * @Description :
 * @Date :          2019/8/30 14:34
 * @Author :        Y.C.ZHU
 * @Copyright :     Copyright (c) 2016<br>
 */
public class User {
    private Integer id;
    private String name;
    private Byte sex;
    private Integer age;

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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
