/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Promocion implements Serializable {
    @Id
    private String nombre;
    private float descuento;
    private float precio ;
    @OneToMany
    @JoinColumn(name = "nombre")
    private HashMap <String, Servicio> servicios;
    
    
    public Dt_promo VerInfoPromocion(){
    Dt_promo nuevo = new Dt_promo();
    nuevo.setNombre(this.getNombre());
    nuevo.setPrecio(this.getPrecio());
    nuevo.setDescuento(this.getDescuento());
    Iterator it = this.getServicios().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry c =(Map.Entry) it.next();
            Servicio value = (Servicio)c.getValue();
            nuevo.setServicios(value.VerInfoServicio());
        }
    return nuevo;
    }
    
    public Promocion(String nombre, float descuento, float precion, HashMap <String, Servicio> servicios) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precio = precion;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecion(float precio) {
        this.precio = precio;
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
