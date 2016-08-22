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
import javax.persistence.OneToOne;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Ciudad implements Serializable {
    @Id 
    private String Nombre;
    @OneToOne
    private Pais pais;

    public String getNombre() {
        return Nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public Ciudad(String Nombre, Pais pais) {
        this.Nombre = Nombre;
        this.pais = pais;
    }

    public Ciudad() {
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}