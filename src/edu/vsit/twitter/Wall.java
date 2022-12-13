package edu.vsit.twitter;

import java.util.ArrayList;

public class Wall {
    private ArrayList<Tweet> tweets;
    private ArrayList<Comment> comments;

    public Wall() {
        System.out.println("Wall() called");
        tweets = new ArrayList<Tweet>();
        comments = new ArrayList<Comment>();
    }

    public void addTweet(Tweet t) {
        tweets.add(t);
    }
    public void addComment(Comment c) {
        comments.add(c);
    }

    public void deleteTweet(int id) {
        for(Tweet t: tweets) {
            if(t.getId() == id) {
                tweets.remove(t);
                break;
            }
        }
    }

    public void display() {
        for(Tweet t: tweets) {
            System.out.println(t);
            for(Comment c: comments) {
                if(c.getPid() == t.getId()) {
                    System.out.println("\t" + c);
                }
            }
        }
    }
}
