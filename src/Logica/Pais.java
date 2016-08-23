/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Pais implements Serializable {

    private @Id String Nombre;
    @OneToMany
    private HashMap <String, Ciudad> ciudades;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public HashMap<String, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<String, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Pais() {
    }

    public Pais(String Nombre) {
        this.Nombre = Nombre;
    }
}
