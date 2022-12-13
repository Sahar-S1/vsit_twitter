package edu.vsit.twitter;

public class Driver {
    public static void main(String[] args) {
        Tweet t1 = new Tweet(101);

        Tweet t2 = new Tweet(102);
        t2.setContent("Hello World");

        Wall wall = new Wall();

        wall.addTweet(t1);
        wall.addTweet(t2);

        Comment c1 = new Comment(901, "u", "Nice");
        Comment c2 = new Comment(902, "s", "Awesome");
        Comment c3 = new Comment(903, "s", ":)");

        t1.addComment(c1);
        t2.addComment(c2);
        c2.addComment(c3);

        wall.display();
    }
}
