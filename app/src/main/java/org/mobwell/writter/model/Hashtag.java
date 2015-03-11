package org.mobwell.writter.model;

/**
 * Created by dsangui on 3/11/15.
 */
public class Hashtag {
    int id;
    String tag;

    public Hashtag(int id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
