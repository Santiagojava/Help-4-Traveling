/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public static  class Sistema implements Serializable {

    @Id
    private Long id;
    @ManyToOne
    private Categoria categorias;
    @ManyToOne
    private Reserva reservas;
    @ManyToOne
    private Usuario usuarios;
    @ManyToOne
    private Servicio servicios;
    @ManyToOne
    private Promocion promociones;
    
    public void ActualizarEstadoReserva(int res,enum Estado){}
    public void AltaPromocion(Dt_promo promo){}
    public void Alta Servicio(Dt_servicio serv){}
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
