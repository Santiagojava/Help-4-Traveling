/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
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
    private int codigo;

    
    private String nombre;
    private String descripcion;
    private float precio;
    private Imagen imagen[];
    @OneToMany
    private HashMap <String,Categoria> categorias;
    @OneToOne
    private Proveedor proveedore;
    @OneToOne
    private Ciudad ciudad;
    public void ModificarServicio(Dt_servicio serv){}
    public Dt_servicio VerInfoServicio(){}

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Servicio(int codigo, String nombre, String descripcion, float precio, Imagen[] imagen, HashMap<String, Categoria> categorias, Proveedor proveedore, Ciudad ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.categorias = categorias;
        this.proveedore = proveedore;
        this.ciudad = ciudad;
    }

    public Servicio(int codigo, String nombre, String descripcion, float precio, Imagen[] imagen, Proveedor proveedore, Ciudad ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.proveedore = proveedore;
        this.ciudad = ciudad;
    }

    public HashMap<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashMap<String, Categoria> categorias) {
        this.categorias = categorias;
    }

    public Proveedor getProveedore() {
        return proveedore;
    }

    public void setProveedore(Proveedor proveedore) {
        this.proveedore = proveedore;
    }

    


    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
