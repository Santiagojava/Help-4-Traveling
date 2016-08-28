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
    private HashMap <String, Catpadre> categorias;
    @OneToMany
    @JoinColumn(name = "fk_reservas")
    private  HashMap <Integer,Reserva> reservas;
    @OneToMany
    @JoinColumn(name = "fk_usuarios")
    private HashMap <String,Usuario> usuarios;
    @OneToMany
    @JoinColumn(name = "fk_servicios")
    private HashMap <String,Servicio> servicios;
    @OneToMany
    @JoinColumn(name = "fk_promociones")
    private HashMap <String , Promocion> promociones;
    @OneToMany
    @JoinColumn(name = "fk_ciudades")
    private HashMap <String , Ciudad> ciudades;
    
    public void AltaUsuario(Dt_usuario usu){
        boolean correoOK = false;
        boolean nickOK = false; 
        Usuario user;
        if(!usuarios.containsKey(usu.getNick())){
            nickOK = true;
            Iterator it = this.usuarios.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry c =(Map.Entry) it.next();
                Usuario value = (Usuario)c.getValue();
                if(usu.getEmail().equals(value.getEmail())) {
                    correoOK = false;
                    JOptionPane.showInputDialog("El Correo electronico ya existe");
                }
                else
                    correoOK = true;
            }
        }
        else{
            nickOK = false;
            JOptionPane.showInputDialog("El Nick ya existe, por favor ingrese otro");
        }
        if(correoOK && nickOK && (usu.getNombre()!= null)&& (usu.getApellido()!= null &&(usu.getFechaNac() != null))){
            if(usu.isProveedor()){
               user = new Proveedor(usu.getNombreEmp(),usu.getLink(), usu.getNick(), usu.getNombre(), usu.getApellido(),usu.getEmail());
            }
            else{
                user = new Cliente(usu.getNick(), usu.getNombre, usu.getApellido, usu.getEmail());
            }
        usuarios.put(user.getNick(), user);
        JOptionPane.showMessageDialog(null, "El usuario se creo Correctamente"); 
        }
        else 
            JOptionPane.showMessageDialog(null, "Error al crear el Usuario, Verifique los campos obligatorios.");
    }
    
    public void ActualizarEstadoReserva(int res,Estado estadoRes){
    this.reservas.get(res).ActualizarEstadoReserva(estadoRes);
    }
    public void AltaPromocion(Dt_promo promo){}
    
    public Dt_servicio VerInfoServicio(String cat, String ser){
    return categorias.get(cat).verInfoServicio(ser);
    }
    public Dt_promo VerInfoPromocion(String promo){
        return(promociones.get(promo).VerInfoPromocion());
    }
    
    public void AltaServicio(Dt_servicio serv){
        boolean catOk = false;
        Servicio ser = new Servicio();
        ser.setNombre(serv.getNombre());
        ser.setCiudad_o(ciudades.get(serv.getCiudad_pais_o().getCiudad()));
        if(ser.getCiudad_o()== null)
            JOptionPane.showInputDialog("La Ciudad de Origen no fue ingresada o la misma no es valida");
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
            if(categorias.get(value.getNombre())== null){
                Iterator ite = categorias.entrySet().iterator();
                while(ite.hasNext()){
                    Map.Entry ca =(Map.Entry) ite.next();
                    Catpadre val = (Catpadre)ca.getValue();
                    if(val.getCathijas().get(value.getNombre())== null)
                          catOk = false;
                    else{
                    ser.setCategorias(val.getCathijas().get(value.getNombre()));
                    catOk= true;
                    }
                }
            }
            else{
                ser.setCategorias(categorias.get(value.getNombre()));
                catOk = true;
            }
            if(!catOk)
                JOptionPane.showInputDialog("La categoria especificada no existe \n"+ value.getNombre()+ "No fue encontrada.");
            
        }
        Iterator iter = ser.getCategorias().entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry c =(Map.Entry) iter.next();
            Categoria value = (Categoria)c.getValue();
            value.setServicios(ser);
        }
        
    }
    
    public void ActualizarServicio(Dt_servicio serv){
    Servicio nuevo = servicios.get(serv.getNombre());
    Iterator iter = serv.getCategorias().entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry c =(Map.Entry) iter.next();
            Dt_categoria value = (Dt_categoria)c.getValue();
            if(!nuevo.getCategorias().containsKey(value.getNombre())){
                nuevo.setCategorias(categorias.get(value.getNombre()));
            }
        }
    Iterator ite = nuevo.getCategorias().entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry c =(Map.Entry) ite.next();
            Categoria value = (Categoria)c.getValue();
            if(!serv.getCategorias().containsKey(value.getNombre())){
                nuevo.getCategorias().remove(value.getNombre());
            }
            else{
                if(!nuevo.getCategorias().containsKey(value.getNombre())){
                    nuevo.getCategorias().get(value.getNombre()).setServicios(nuevo);
                }
            }
        }    
        nuevo.setCiudad_o(ciudades.get(serv.getCiudad_pais_o().getCiudad()));
        if(nuevo.getCiudad_o()== null)
            JOptionPane.showInputDialog("La Ciudad de Origen no fue ingresada o la misma no es valida");
        nuevo.setCiudad_d(ciudades.get(serv.getCiudad_pais_d().getCiudad()));
        nuevo.setDescripcion(serv.getDescripcion());
        nuevo.setImagen(serv.getImagen());
        nuevo.setPrecio(serv.getPrecio());
        servicios.remove(nuevo.getNombre());
        this.setServicios(nuevo);
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

    public HashMap<String, Catpadre> getCategorias() {
        return categorias;
    }

    public void setCategorias(Catpadre categorias) {
        this.categorias.put(categorias.getNombre(), categorias);
    }

    public HashMap<Integer, Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas.put(reservas.getCod(), reservas) ;
    }



    public HashMap<String, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<String, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    

    public HashMap<String, Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicios) {
        this.servicios.put(servicios.getNombre(), servicios);
    }

    public HashMap<String, Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(Promocion promociones) {
        this.promociones.put(promociones.getNombre(), promociones);
    }
}
