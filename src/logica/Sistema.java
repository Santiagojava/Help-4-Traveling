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
import javax.swing.JOptionPane;

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
    @JoinColumn(name = "fk_usuarios")
    private HashMap <String,Usuario> usuarios;
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
        if(ser.getCiudad_d()== null)
            JOptionPane.showInputDialog("La Ciudad de Origen espesificada no existe");
        ser.setCiudad_d(ciudades.get(serv.getCiudad_pais_d().getCiudad()));
        Proveedor pro = (Proveedor)usuarios.get(serv.getNombre_prov());
        if(pro == null)
            JOptionPane.showInputDialog("El proveedor indicado no exixte");
        ser.setProveedor(pro);
        ser.setDescripcion(serv.getDescripcion());
        ser.setImagen(serv.getImagen());
        ser.setPrecio(serv.getPrecio());
        Iterator it = serv.getCategorias().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry c =(Map.Entry) it.next();
            Dt_categoria value = (Dt_categoria)c.getValue();
            if(categorias.get(value.getNombre())== null)
                JOptionPane.showInputDialog("La Categoria especificada no existe");
            ser.setCategorias(categorias.get(value.getNombre()));
        }
        Iterator iter = ser.getCategorias().entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry c =(Map.Entry) iter.next();
            Categoria value = (Categoria)c.getValue();
            value.setServicios(ser);
        }
        
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios( Usuario usuarios) {
        this.usuarios.put(usuarios.getNick(), usuarios);
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
