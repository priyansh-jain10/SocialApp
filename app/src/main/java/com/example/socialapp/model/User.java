package com.example.socialapp.model;
public class User {
    private String uid;
    private String displayName;
    private String imageUrl;
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public User(){

    }

    public User(String uid, String displayName, String imageUrl) {
        this.uid = uid;
        this.displayName = displayName;
        this.imageUrl = imageUrl;
    }
}
