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
import javax.persistence.JoinColumn;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cod;
    @OneToOne
    private Fecha fechaCreado;
    private float precio;
    private Estado estado;
    @OneToOne
    private Cliente cliente;
    @OneToMany
    @JoinColumn(name = "cod")
    private HashMap <Integer,IntoReserva> ser_prom;// coleccion de intoreservas que contienen servicios y promociones.

    public Reserva() {
    }
    public void IngresarDatosPromocion(int cant, Fecha fechaIni, Fecha fechafin){}
    public void ActualizarEstadoReserva(Estado estado){
        if(this.estado == REGISTRADA)
            this.setEstado(estado);
        else
            JOptionPane.showInputDialog("El estado actual de la Reserva es distinto de REGISTRADA, Imposible modificar Estado");
    }
    public void IngresarDatosServicio(int cant, Fecha fechaIni, Fecha fechafin){}
    public void CancelaReserva(){
        Estado est = CANCELADA;
    this.setEstado(est);
    }
    //public Dt_reserva VerInfoReserva(){}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

  
    public Fecha getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Fecha fechaCreado) {
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

    public Reserva(int clave, Fecha fechaCreado, float precio, Estado estado, Cliente cliente, HashMap<Integer, IntoReserva> ser_prom) {
        this.cod = clave;
        this.fechaCreado = fechaCreado;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
        this.ser_prom = ser_prom;
    }

    public Reserva(int clave, Fecha fechaCreado, float precio, Estado estado, Cliente cliente) {
        this.cod = clave;
        this.fechaCreado = fechaCreado;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
    }

    public HashMap<Integer, IntoReserva> getSer_prom() {
        return ser_prom;
    }

    public void setSer_prom(HashMap<Integer, IntoReserva> ser_prom) {
        this.ser_prom = ser_prom;
    }

    
    
    
}
