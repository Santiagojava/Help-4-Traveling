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
    public void setnick(String nick){
        this.nick = nick;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getnick(){
        return this.nick;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getapellido(){
        return this.apellido;
    }
    public String getemail(){
        return this.email;
    }
    public Usuario(){}
    
    
    
}
