package edu.vsit.twitter;

import java.awt.Image;
import java.awt.image.BufferedImage;

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

        Image img = new BufferedImage(100, 100, 10);
        Tweet t3 = new ImageTweet(105, img, "100x100 TYPE_BYTE_GRAY Image");

        wall.addTweet(t3);

        wall.display();
    }
}
