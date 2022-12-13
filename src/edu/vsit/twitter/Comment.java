package edu.vsit.twitter;

import java.util.Date;

public class Comment {
    private int id;
    private String user;
    private String content;
    private Date timestamp;
    private int pid;

    public Comment(int id, String user, String content, int pid) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.timestamp = new Date();
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", pid=" + pid +
                '}';
    }
}
