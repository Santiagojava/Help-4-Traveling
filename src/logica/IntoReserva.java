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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class IntoReserva  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod;
    private int cantidad;
    @OneToOne
    @JoinColumn(name = "cod")
    private Fecha FechaInicio;
    @OneToOne
    @JoinColumn(name = "cod")
    private Fecha FechaFin;
    @OneToOne 
    @JoinColumn(name = "nombre")
    private Promocion promocion;
    @OneToOne 
    @JoinColumn(name = "nombre")
    private Servicio servicio;
    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Fecha getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Fecha FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Fecha getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Fecha FechaFin) {
        this.FechaFin = FechaFin;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}
