/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Lucas.Groba
 */
public class Dt_usuario {
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private Imagen imagen;
    private Fecha fechaNac;
    private String nombreEmp;
    private String link;
    private boolean proveedor;

    public Dt_usuario(String nick, String nombre, String apellido, String email, Imagen imagen, Fecha fechaNac, String nombreEmp, String link, boolean proveedor) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imagen = imagen;
        this.fechaNac = fechaNac;
        this.nombreEmp = nombreEmp;
        this.link = link;
        this.proveedor = proveedor;
    }

    

    public Dt_usuario() {
    }

    public String getNick() {
        return nick;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

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

    public boolean isProveedor() {
        return proveedor;
    }

    public void setProveedor(boolean proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
    
}
