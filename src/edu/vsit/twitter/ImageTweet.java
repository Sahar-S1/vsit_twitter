package edu.vsit.twitter;

import java.awt.Image;

public class ImageTweet extends Tweet {
    private Image image;

    public ImageTweet(int id, Image image, String caption) {
        super(id);
        this.image = image;
        this.setContent(caption);
    }

    @Override
    public String toString() {
        return "ImageTweet{" +
                "id=" + this.getId() +
                ",image=" + image +
                ",caption=" + this.getContent() +
                ",user=" + this.getUser() +
                ",timestamp=" + this.getTimestamp() +
                "}";
    }
}
