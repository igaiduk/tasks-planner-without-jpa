package com.amazon.java.mentorship.entities;

public class User {
    private static int count = 0;
    private int id;
    private String login;
    private String fullName;

    public User(String login, String fullName) {
        this.id = ++count;
        this.login = login;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\'' +
                ", login='" + login + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

