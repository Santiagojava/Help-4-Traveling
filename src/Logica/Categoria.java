/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Categoria implements Serializable {

   @Id private String nombre;
    @ManyToOne
   private Servicio servicios;
    @ManyToOne
   private Categoria categorias;
   public Categoria(){}
   public void setnombre(String nombre){
        this.nombre = nombre;
   }
   public void setcategoria(Categoria categoria){}
   public void setcategoria(Servicio servicio){}
   public String getnombre(){
        return this.nombre;
   }
   public Servicio getservicio(){
        return this.servicios;
   }
   
   
    
}
