/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Lucas.Groba
 */
public class Dt_servicio {
    public String nombre;
    public String descripcion;
    public float precio;
    public Imagen imagen[];
    public Dt_lugar ciudad_pais_o;
    public Dt_lugar ciudad_pais_d;
    public String nombre_prov;
    public HashMap <String, Dt_categoria> categorias;

    public Dt_servicio(String nombre, String descripcion, float precio, Dt_lugar ciudad_pais_o, Dt_lugar ciudad_pais_d, String nombre_prov, HashMap <String, Dt_categoria> categorias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ciudad_pais_o = ciudad_pais_o;
        this.ciudad_pais_d = ciudad_pais_d;
        this.nombre_prov = nombre_prov;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen[] getImagen() {
        return imagen;
    }

    public void setImagen(Imagen[] imagen) {
        this.imagen = imagen;
    }

   
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Dt_lugar getCiudad_pais_o() {
        return ciudad_pais_o;
    }

    public void setCiudad_pais_o(Dt_lugar ciudad_pais_o) {
        this.ciudad_pais_o = ciudad_pais_o;
    }

    public Dt_lugar getCiudad_pais_d() {
        return ciudad_pais_d;
    }

    public void setCiudad_pais_d(Dt_lugar ciudad_pais_d) {
        this.ciudad_pais_d = ciudad_pais_d;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    public HashMap<String, Dt_categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashMap<String, Dt_categoria> categorias) {
        this.categorias = categorias;
    }

    

    public Dt_servicio() {
    }
    
}
