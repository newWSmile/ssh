package com.one.pojos;

/**
 * Created by wyj on 2016/9/22.
 */
public class User {
    private String id;
    private String name;
    private String pwd;

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getId() {
        return id;
    }
}
