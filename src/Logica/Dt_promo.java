/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Collection;

/**
 *
 * @author Lucas.Groba
 */
public class Dt_promo {
    public String nombre;
    public float descuento;
    public float precio;
    public Collection <Dt_servicio> servicios;

    public Dt_promo(String nombre, float descuento, float precio, Collection<Dt_servicio> servicios) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precio = precio;
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

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Collection<Dt_servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Collection<Dt_servicio> servicios) {
        this.servicios = servicios;
    }

  
}