package edu.vsit.twitter;

import java.util.Date;

public class Tweet {
    // Properties
    private int id;
    private String user;
    private String content;
    private Date timestamp;

    // Default Constructor
    public Tweet() {
        System.out.println("Tweet() called");
        this.id = 0;
        this.user = "<Anonymous>";
        this.content = "...";
        this.timestamp = new Date();
    }

    // Getter Setter Methods
    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        updateTimestamp();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    // Other Methods

    private void updateTimestamp() {
        this.timestamp = new Date();
    }

    // toString()
    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ",user=" + user +
                ",content=" + content +
                ",timestamp=" + timestamp +
                '}';
    }
}
