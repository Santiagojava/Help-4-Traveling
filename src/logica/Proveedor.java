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

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Proveedor extends Usuario implements Serializable {
    private String nombreEmp;
    private String link;
    @OneToMany
    @JoinColumn(name = "nombre")
    private HashMap <String, Servicio> servicios;
    //public Dt_prov DatosProveedor(){}   

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public HashMap<String, Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(HashMap<String, Servicio> servicios) {
        this.servicios = servicios;
    }
    public void setnombreEmp(String nombre){
    this.nombreEmp = nombre;
    }

    public Proveedor(String nombreEmp, String link) {
        this.nombreEmp = nombreEmp;
        this.link = link;
    }
    public void setlink(String link){
    this.link = link;
    }
    public String getnombreEmp(){
    return this.nombreEmp;
    }
    public String getlink(){
    return this.link;
    }
    public Proveedor(){}
    
}
