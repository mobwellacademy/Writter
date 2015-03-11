package org.mobwell.writter.model;

/**
 * Created by dsangui on 3/11/15.
 */
public class Post {
    String paragraph, date;
    Hashtag tag;

    public Post(String paragraph, String date, Hashtag tag) {
        this.paragraph = paragraph;
        this.date = date;
        this.tag = tag;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Hashtag getTag() {
        return tag;
    }

    public void setTag(Hashtag tag) {
        this.tag = tag;
    }
}
