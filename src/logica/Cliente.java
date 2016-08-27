/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
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
public class Cliente extends Usuario implements Serializable {

   
    
    @OneToMany
    @JoinColumn(name = "cod")
    private HashMap <Integer,Reserva> reservas;
    public Dt_cliente getInfoCliente(){
    Dt_cliente ret= null;
    return ret;
    }

    public HashMap<Integer, Reserva> getReservas() {
        return reservas;
    }

    public Cliente(String nick, String nombre, String apellido, String email) {
        super(nick, nombre, apellido, email);
    }

   
    
    public void setReservas(HashMap<Integer, Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
