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
public class Dt_categoria {
    public String nombre;
    public HashMap <String,Dt_categoria> categorias;
    public HashMap <String, Dt_servicio> servicios;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Dt_categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashMap<String, Dt_categoria> categorias) {
        this.categorias = categorias;
    }

    public HashMap<String, Dt_servicio> getServicios() {
        return servicios;
    }

    public void setServicios(HashMap<String, Dt_servicio> servicios) {
        this.servicios = servicios;
    }

  

  
    
}
