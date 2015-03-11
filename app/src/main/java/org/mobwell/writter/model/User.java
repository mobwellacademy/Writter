package org.mobwell.writter.model;

/**

 * Created by Macarena on 11/03/2015.
 */
public class User {
    String nick, email, descripcion, foto;


    public User(String nick, String email, String descripcion, String foto) {
        this.nick = nick;
        this.email = email;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
