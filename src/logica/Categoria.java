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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Categoria implements Serializable {

   @Id private String nombre;
    @ManyToMany(mappedBy = "categorias")
   private HashMap <String ,Servicio> servicios;
    @OneToMany 
    @JoinColumn(name = "nombre")
   private  HashMap <String, Categoria> categorias;
   public Categoria(){}
   
  
  
   
    public void altaCategoria(String nombre){
    }
    
    
    public Dt_servicio verInfoServicio(String nombreserv){
    return servicios.get(nombreserv).VerInfoServicio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String , Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio serv) {
        this.servicios.put(serv.getNombre(), serv);
    }

    public HashMap<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria cat) {
        this.categorias.put(cat.getNombre(), cat);
    }
    
 
   
   
    
}
