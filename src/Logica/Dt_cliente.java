/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Collection;

/**
 *
 * @author Lucas.Groba
 */
public class Dt_cliente {
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private Imagen imagen ;
    private Collection < Dt_reserva> reservas;

    public String getNick() {
        return nick;
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

    public Collection<Dt_reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Dt_reserva> reservas) {
        this.reservas = reservas;
    }

  

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
}

