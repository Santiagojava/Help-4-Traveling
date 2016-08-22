/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import static org.eclipse.persistence.expressions.ExpressionOperator.any;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Servicio implements Serializable {
@Id
    private String nombre;
    private String descripcion;
    private float precio;
    private Imagen imagen[];
    @OneToMany
    private Collection <Categoria> categorias;
    @OneToOne
    private Proveedor proveedores;
    @OneToOne
    private Ciudad ciudad;
    public void ModificarServicio(Dt_servicio serv){}
    public Dt_servicio VerInfoServicio(){}

    public Servicio(String nombre, String descripcion, float precio, Imagen[] imagen, Collection<Categoria> categorias, Proveedor proveedores, Ciudad ciudad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.categorias = categorias;
        this.proveedores = proveedores;
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Imagen[] getImagen() {
        return imagen;
    }

    public void setImagen(Imagen[] imagen) {
        this.imagen = imagen;
    }

    public Collection<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Collection<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Proveedor getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor proveedores) {
        this.proveedores = proveedores;
    }


    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
