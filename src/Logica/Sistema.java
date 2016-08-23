/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
    public class Sistema implements Serializable {

    @Id
    private Long id;
    @OneToMany
    private HashMap <String,Categoria> categorias;
    @OneToMany
    private  HashMap <Integer,Reserva> reservas;
    @OneToMany
    private HashMap <String,Usuario> usuarios;
    @OneToMany
    private HashMap <Integer,Servicio> servicios;
    @OneToMany
    private HashMap <String , Promocion> promociones;
    
    public void ActualizarEstadoReserva(int res,Estado estadoRes){
    this.reservas.get(res).ActualizarEstadoReserva(estadoRes);
    }
    public void AltaPromocion(Dt_promo promo){}
    public void Alta Servicio(Dt_servicio serv){}
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashMap<String, Categoria> categorias) {
        this.categorias = categorias;
    }

    public HashMap<Integer, Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(HashMap<Integer, Reserva> reservas) {
        this.reservas = reservas;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashMap<Integer, Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(HashMap<Integer, Servicio> servicios) {
        this.servicios = servicios;
    }

    public HashMap<String, Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(HashMap<String, Promocion> promociones) {
        this.promociones = promociones;
    }

    
}
