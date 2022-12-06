package edu.vsit.twitter;

public class Wall {
    private Tweet [] tweets;
    private int idx;

    public Wall() {
        System.out.println("Wall() called");
        tweets = new Tweet[100];
        idx = 0;
    }

    public void addTweet(Tweet t) {
        if(idx < 100) {
            tweets[idx] = t;
            idx++;
        }
    }

    public void display() {
        for(Tweet t: tweets) {
            if(t != null) {
                System.out.println(t);
            }
        }
    }
}
