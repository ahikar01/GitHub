/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import com.mycompany.github.Factura;

/**
 *
 * @author acolomer.daw1r
 */
public class LiniesFactura {
    private Factura numL;
    private int total;

    public LiniesFactura(Factura numL, int total) {
        this.numL = numL;
        this.total = total;
    }

    public Factura getNumL() {
        return numL;
    }

    public void setNumL(Factura numL) {
        this.numL = numL;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
