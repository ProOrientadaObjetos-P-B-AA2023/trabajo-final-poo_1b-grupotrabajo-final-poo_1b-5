/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombreBarrio;
    private String referencia;

    public Barrio(String nombreBarrio, String referencia) {
        this.nombreBarrio = nombreBarrio;
        this.referencia = referencia;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public String getReferencia() {
        return referencia;
    }

    @Override
    public String toString() {
        return nombreBarrio +" "+ referencia ;
    }
}
