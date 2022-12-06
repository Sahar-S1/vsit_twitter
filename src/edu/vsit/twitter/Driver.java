package edu.vsit.twitter;

public class Driver {
    public static void main(String[] args) {
        Tweet myfirsttweet = new Tweet();
        System.out.println(myfirsttweet);

        Tweet t2 = new Tweet();
        System.out.println(t2);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }

        t2.setContent("Hello World");
        System.out.println(t2);

        Wall wall = new Wall();
        for(int i = 0; i < 10; i++) {
            wall.addTweet(new Tweet());
        }
        wall.display();
    }
}
