package org.mobwell.writter.model;

import java.util.ArrayList;

/**
 * Created by dsangui on 3/11/15.
 */
public class Book {
    String title;
    Hashtag genre;
    // 3 types of lenght
    int lenght;
    ArrayList<Post> arPosts;

    public static final int FRASES = 250;
    public static final int RELATO = 500;
    public static final int NOVELA = 1000;

    public Book(String title, Hashtag genre, int lenght, ArrayList<Post> arPosts) {
        this.title = title;
        this.genre = genre;
        this.lenght = lenght;
        this.arPosts = arPosts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Hashtag getGenre() {
        return genre;
    }

    public void setGenre(Hashtag genre) {
        this.genre = genre;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public ArrayList<Post> getArPosts() {
        return arPosts;
    }

    public void setArPosts(ArrayList<Post> arPosts) {
        this.arPosts = arPosts;
    }
}
