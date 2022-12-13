package edu.vsit.twitter;

import java.util.ArrayList;
import java.util.Date;

public class Tweet {
    // Properties
    private int id;
    private String user;
    private String content;
    private Date timestamp;
    private ArrayList<Comment> comments;

    // Default Constructor
    public Tweet(int id) {
        System.out.println("Tweet() called");
        this.id = id;
        this.user = "<Anonymous>";
        this.content = "...";
        this.timestamp = new Date();
        this.comments = new ArrayList<Comment>();
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

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void showComments() {
        for(Comment comment: comments) {
            System.out.println("\t" + comment);
        }
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
