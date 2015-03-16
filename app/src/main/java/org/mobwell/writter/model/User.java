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

    public User(){}

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

    //comprobar usuario (boolean (user, pass))
    public boolean Login(String nick, String pass)
    {
        //Si el nick de la BD y su pass se corresponden
        return true;
        //si no
        //return false;

    }
    //guardar/registrar (boolean o class (user,pass, email,desc,foto)
    public boolean Register(String nick, String email, String descripcion, String foto, String pass)
    {
        /*if((nick ya existe en DB) || (nick no válido))return false; //usuario ya registrado o no válido

        if((mail ya existe en DB) || (mail no válido)) return false; //mail ya registrado o no válido

        if(pass no válida) //un mínimo de seguridad

        if (descripcion no válida) return false; //por muchos y diversos motivos

        if(!foto || !descripción) return false; //nada de campos vacíos

        (Si funciona, subir a base de datos y)*/
        return true;

    }

    public boolean ChangePass(String pass, String newpass, String npcheck)
    {
        /*if(pass==passdeDB) //comprobar pass
        {
            if ((newpass == npcheck) && (newpass es válida)) //seguridad redundante
            {
                //Grabar en base de datos nueva pass
                return true;
            }
        }*/
        return false; //con mensajito de error
    }

    public boolean ChangeFoto(String pass, String newfoto)
    {
        /*if(pass==passdeBD) //comprobar pass
        {
            if (newfoto es válida) //motivos obvios y legales
            {
                //Grabar foto en DB
                return true;
            }
        }*/
        return false; //con mensajito de error
    }

    public boolean ChangeDescription(String pass, String newdesc)
    {
        /*if(pass==passdeBD) //comprobar pass
        {
            if (newdesc es válida) //motivos obvios y legales
            {
                //Grabar descripcion en DB
                return true;
            }
        }*/
        return false; //con mensajito de error
    }

}
