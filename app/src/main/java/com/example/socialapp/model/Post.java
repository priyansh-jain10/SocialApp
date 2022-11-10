package com.example.socialapp.model;

public class Post {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    private User createdBy;
    private long createdAt;
    public Post(){

    }
    public Post(String text, User createdBy, long createdAt) {
        this.text = text;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }
}
