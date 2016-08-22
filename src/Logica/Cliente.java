/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Collection;
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
public class Cliente extends Usuario implements Serializable {

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas.add( reservas);
    }
    
    @OneToMany
    private Collection <Reserva> reservas;
    public Dt_cliente getInfoCliente(){
    Dt_cliente ret= null;
    return ret;
    }
    
}
