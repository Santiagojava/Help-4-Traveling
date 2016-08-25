/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Usuario implements Serializable {
    @Id private String nick;
    private String nombre;
    private String apellido;
    private String email;
//    private Imagen imagen;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public Usuario(String nick, String nombre, String apellido, String email) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    public Usuario(){}
    
    
    
}
