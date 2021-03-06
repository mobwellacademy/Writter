package org.mobwell.writter.model;

import java.util.ArrayList;

/**
 * Created by dsangui on 3/11/15.
 */
public class Book {
    String title;
    ArrayList<Hashtag> genre;
    // 3 types of lenght
    int lenght;
    ArrayList<Post> arPosts;

    public static final int FRASES = 250;
    public static final int RELATO = 500;
    public static final int NOVELA = 1000;

    public Book(String title, int lenght, ArrayList<Post> arPosts) {
        this.title = title;
        this.lenght = lenght;
        this.arPosts = arPosts;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Hashtag> getGenre() {
        return genre;
    }

    public void addHashtag(Hashtag newHash) {
        this.genre.add(newHash);
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

    public void listBooks(){
       /* Post pt = new Post();
        pt.postActuales(); //Recupero los ultimos post para listar los libros mas recientes, agrupar por libro

        */
    }

    public void showBook(int id_book){
       /* Post pt = new Post();
       esCreador();
        pt.dameParrafos(id_book);

        */
    }

    public void closeBook(int id_book){
        /*
        * this.close = true;
        * */
    }

    public void esCreador(){

        /**
         * comprobamos si el usuario es creador del libro para que pueda administrar los post
         *
         */
    }
}
