/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
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
public class Categoria implements Serializable {

   @Id private String nombre;
    @OneToMany
   private Collection <Servicio> servicios;
    @OneToMany
   private  Collection <Categoria> categorias;
   public Categoria(){}
   public void setnombre(String nombre){
        this.nombre = nombre;
   }
   public void setcategoria(Categoria categoria){}
   public void setservicio(Servicio servicio){}
   public String getnombre(){
        return this.nombre;
   }
   public Servicio getservicio(){}
   public void altaCategoria(String nombre){}
   public Dt_servicio verInfoServicio(String nombreserv){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Collection<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Collection<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Collection<Categoria> categorias) {
        this.categorias = categorias;
    }
   
   
    
}
