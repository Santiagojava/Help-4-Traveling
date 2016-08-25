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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Promocion implements Serializable {
    @Id
    private String nombre;
    private float descuento;
    private float precion ;
    @OneToMany
    @JoinColumn(name = "nombre")
    private HashMap <String, Servicio> servicios;
    public void VerInfoPromocion(){}

    public Promocion(String nombre, float descuento, float precion, HashMap <String, Servicio> servicios) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precion = precion;
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getPrecion() {
        return precion;
    }

    public void setPrecion(float precion) {
        this.precion = precion;
    }

    public HashMap<String, Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(HashMap<String, Servicio> servicios) {
        this.servicios = servicios;
    }



    public Promocion() {
    }

    
    
}
