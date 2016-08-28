/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Catpadre extends Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private HashMap <String , Servicio > servicios;
    private HashMap < String , Cathija > catHijas; 

    public Catpadre() {
    }

    public HashMap<String, Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio  servicios) {
        this.servicios.put(servicios.getNombre(),servicios);
    }

    public HashMap<String, Cathija> getCatHijas() {
        return catHijas;
    }

    public void setCatHijas(Cathija catHijas) {
        this.catHijas.put(catHijas.getNombre(), catHijas);
        
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catpadre)) {
            return false;
        }
        Catpadre other = (Catpadre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica.Catpadre[ id=" + id + " ]";
    }
    
}
