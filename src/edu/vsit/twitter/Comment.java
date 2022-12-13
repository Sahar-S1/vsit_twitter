package edu.vsit.twitter;

import java.util.Date;

public class Comment extends Tweet {
    public Comment(int id, String user, String content) {
        super(id);
        System.out.println("Comment() called");
        this.setUser(user);
        this.setContent(content);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + this.getId() +
                ",user=" + this.getUser() +
                ",content=" + this.getContent() +
                ",timestamp=" + this.getTimestamp() +
                "}";
    }
}
