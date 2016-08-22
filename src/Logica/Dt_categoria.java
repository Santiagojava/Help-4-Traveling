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
public class Dt_categoria {
    public String nombre;
    public Collection <Dt_categoria> categorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Dt_categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Dt_categoria categorias) {
        this.categorias.add(categorias);
    }

    public Collection<Dt_servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Collection<Dt_servicio> servicios) {
        this.servicios = servicios;
    }
    public Collection <Dt_servicio> servicios;
}
