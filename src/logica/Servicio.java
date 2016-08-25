/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name = "fk_categorias")
    private HashMap <String,Categoria> categorias;
    @OneToOne
    @JoinColumn(name = "fk_proveedor")
    private Proveedor proveedor;
    @OneToOne
    @JoinColumn(name = "fk_ciudad_o")
    private Ciudad ciudad_o;
    @OneToOne
    @JoinColumn(name = "fk_ciudad_d")
    private Ciudad ciudad_d;
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

    public Servicio() {
    }

    public Imagen[] getImagen() {
        return imagen;
    }

    public void setImagen(Imagen[] imagen) {
        this.imagen = imagen;
    }

   

    public HashMap<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria cat) {
        this.categorias.put(cat.getNombre(), cat);
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Servicio(String nombre, String descripcion, float precio, Imagen[] imagen, Proveedor proveedor, Ciudad ciudad_o, Ciudad ciudad_d) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.proveedor = proveedor;
        this.ciudad_o = ciudad_o;
        this.ciudad_d = ciudad_d;
    }

    public Ciudad getCiudad_o() {
        return ciudad_o;
    }

    public void setCiudad_o(Ciudad ciudad_o) {
        this.ciudad_o = ciudad_o;
    }

    public Ciudad getCiudad_d() {
        return ciudad_d;
    }

    public void setCiudad_d(Ciudad ciudad_d) {
        this.ciudad_d = ciudad_d;
    }
}
