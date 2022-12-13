package edu.vsit.twitter;

import java.util.ArrayList;

public class Wall {
    private ArrayList<Tweet> tweets;

    public Wall() {
        System.out.println("Wall() called");
        tweets = new ArrayList<Tweet>();
    }

    public void addTweet(Tweet t) {
        tweets.add(t);
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
        }
    }
}
