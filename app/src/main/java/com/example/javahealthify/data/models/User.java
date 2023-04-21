package com.example.javahealthify.data.models;

public class User {
    protected String uid;
    protected String email;
    protected String name;
    protected String type; // { "NORMAL_USER", "ADMIN" }

    public User() {}
    public User(String uid, String email, String name, String type) {
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
