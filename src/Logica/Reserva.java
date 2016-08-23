/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static Logica.Estado.CANCELADA;
import static Logica.Estado.REGISTRADA;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Reserva implements Serializable {
    @Id
    private int clave;
    @OneToOne
    private Date fechaCreado;
    private float precio;
    private Estado estado;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    private HashMap <Integer,IntoReserva> res_prom;// coleccion de intoreservas que contienen servicios y promociones.

    public Reserva() {
    }
    public void IngresarDatosPromocion(int cant, Date fechaIni, Date fechafin){}
    public void ActualizarEstadoReserva(Estado estado){
        if(this.estado == REGISTRADA)
            this.setEstado(estado);
        else
            JOptionPane.showInputDialog("El estado actual de la Reserva es distinto de REGISTRADA, Imposible modificar Estado");
    }
    public void IngresarDatosServicio(int cant, Date fechaIni, Date fechafin){}
    public void CancelaReserva(){
        Estado est = CANCELADA;
    this.setEstado(est);
    }
    public Dt_reserva VerInfoReserva(){}

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva(int clave, Date fechaCreado, float precio, Estado estado, Cliente cliente, HashMap<Integer, IntoReserva> res_prom) {
        this.clave = clave;
        this.fechaCreado = fechaCreado;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
        this.res_prom = res_prom;
    }

    public Reserva(int clave, Date fechaCreado, float precio, Estado estado, Cliente cliente) {
        this.clave = clave;
        this.fechaCreado = fechaCreado;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
    }

    public HashMap<Integer, IntoReserva> getRes_prom() {
        return res_prom;
    }

    public void setRes_prom(HashMap<Integer, IntoReserva> res_prom) {
        this.res_prom = res_prom;
    }

    
    
    
}
