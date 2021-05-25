package com.amazon.java.mentorship.entities;


import java.security.acl.Owner;

public class Label {
    private static int count = 0;
    private int id;
    private String name;
    private User owner;

    public Label(String name, User owner) {
        this.id = ++count;
        this.name = name;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}

