package com.amazon.java.mentorship.entities;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private static int count = 0;
    private int id;
    private String name;
    private Priority priority;
    private List<Label> labels;
    private List<Commentary> commentaries;
    private Status status;
    private User owner;

    public Task(Priority priority, User owner) {
        this.id = ++count;
        this.name = name;
        this.priority = priority;
        this.labels = new ArrayList<>();
        this.commentaries = new ArrayList<>();
        this.status = Status.TO_DO;
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

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", labels=" + labels +
                ", commentaries=" + commentaries +
                ", status=" + status +
                ", owner=" + owner +
                '}';
    }
}

