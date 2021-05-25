package com.amazon.java.mentorship.entities;

import java.util.Date;

public class Commentary {
    private static int count = 0;
    private int id;
    private String text;
    private User owner;
    private Date creationDate;

    public Commentary(String text, User owner) {
        this.id = ++count;
        this.text = text;
        this.owner = owner;
        this.creationDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String bookName) {
        this.text = bookName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        return "Commentary{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", owner=" + owner +
                ", creationDate=" + creationDate +
                '}';
    }
}

