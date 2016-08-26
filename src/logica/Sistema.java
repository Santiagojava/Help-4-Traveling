/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lucas.Groba
 */
@Entity
    public class Sistema implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    @JoinColumn(name = "fk_categorias")
    private HashMap <String,Categoria> categorias;
    @OneToMany
    @JoinColumn(name = "fk_reservas")
    private  HashMap <Integer,Reserva> reservas;
    @OneToMany
    @JoinColumn(name = "fk_proveedores")
    private HashMap <String,Proveedor> proveedores;
    @OneToMany
    @JoinColumn(name = "fk_clientes")
    private HashMap <String,Cliente> clientes;
    @OneToMany
    @JoinColumn(name = "fk_servicios")
    private HashMap <Integer,Servicio> servicios;
    @OneToMany
    @JoinColumn(name = "fk_promociones")
    private HashMap <String , Promocion> promociones;
    @OneToMany
    @JoinColumn(name = "fk_ciudades")
    private HashMap <String , Ciudad> ciudades;
    
    public void ActualizarEstadoReserva(int res,Estado estadoRes){
    this.reservas.get(res).ActualizarEstadoReserva(estadoRes);
    }
    public void AltaPromocion(Dt_promo promo){}
    public Dt_servicio VerInfoServicio(String cat, String ser){
    return categorias.get(cat).verInfoServicio(ser);
    }
    public void AltaServicio(Dt_servicio serv){
        Servicio ser = new Servicio();
        ser.setNombre(serv.getNombre());
        ser.setCiudad_o(ciudades.get(serv.getCiudad_pais_o().getCiudad()));
        ser.setCiudad_d(ciudades.get(serv.getCiudad_pais_d().getCiudad()));
        ser.setProveedor(proveedores.get(serv.getNombre_prov()));
        ser.setDescripcion(serv.getDescripcion());
        ser.setImagen(serv.getImagen());
        ser.setPrecio(serv.getPrecio());
        Iterator it = serv.getCategorias().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry c =(Map.Entry) it.next();
            Dt_categoria value = (Dt_categoria)c.getValue();
            ser.setCategorias(categorias.get(value.getNombre()));
        }
        Iterator iter = ser.getCategorias().entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry c =(Map.Entry) iter.next();
            Categoria value = (Categoria)c.getValue();
            value.setServicios(ser);
        }
        
    }
    

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

    public HashMap<String, Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(HashMap<String, Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashMap<String, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<String, Ciudad> ciudades) {
        this.ciudades = ciudades;
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
