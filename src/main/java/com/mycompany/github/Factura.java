/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;



/**
 *
 * @author acolomer.daw1r
 */
public class Factura {
    private LiniesFactura numF;
    private long total;
    private String data;

    public Factura(LiniesFactura numF, int total, String data) {
        this.numF = numF;
        this.total = total;
        this.data = data;
    }

    public LiniesFactura getNumF() {
        return numF;
    }

    public void setNumF(LiniesFactura numF) {
        this.numF = numF;
    }

    public int getTotal() {
        return (int) total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
