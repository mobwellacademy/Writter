package org.mobwell.writter.model;

import java.util.ArrayList;
import java.util.HashSet;

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


    /*Funciones lógicas*/

    public boolean guardarPost(String paragraph, Hashtag tag){
        /*Guarda el Post en BBDD*/
        return true;
    }

    public boolean eliminarPost(String date){
        /*Elimina el Post de BBDD*/
        return true;
    }

    public boolean modificarPost(String paragraph, Hashtag tag, String date){
        /*Guarda el Post en BBDD y elimina el antiguo*/
        if (guardarPost(paragraph,tag) && eliminarPost(date))return true;
        else return false;
    }

    public ArrayList<Post> postActuales(){
        /*Devuelve desde BBDD una lista de Post ordenados por fecha más actual*/
        ArrayList<Post> actualizados = new ArrayList<Post>();
        return actualizados;
    }

    public Post buscarPost (String date){
        /*Devuelve desde BBDD un Post buscado mediante la fecha*/
        String p = getParagraph();
        Hashtag ht = getTag();
        Post post = new Post(p, date, ht);
        return post;
    }
}
