/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Lucas.Groba
 */
@Entity
public class Date implements Serializable {
    private int dd;
    private int mm;
    private int aaaa;

    public Date(int dd, int mm, int aaaa) {
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAaaa() {
        return aaaa;
    }

    public void setAaaa(int aaaa) {
        this.aaaa = aaaa;
    }
    
}
