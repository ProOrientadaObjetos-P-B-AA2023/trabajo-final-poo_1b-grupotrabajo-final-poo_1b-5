/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.util.Formatter;

/**
 *
 * @author reroes
 */
public class Casa {
    private double precioPorMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double costoFinal;
    private int numeroCuartos;


    public Casa(double precioPorMetroCuadrado, double numeroMetrosCuadrados, int numeroCuartos) {
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
        this.numeroCuartos = numeroCuartos;
    }
    public void setPrecioPorMetroCuadrado(double precioPorMetroCuadrado) {
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public void calcularCostoFinal(){
        this.costoFinal= this.numeroMetrosCuadrados*precioPorMetroCuadrado;
    }

    public double getPrecioPorMetroCuadrado() {
        return precioPorMetroCuadrado;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public double getCostoFinal() {
        return costoFinal;
    }
    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "precioPorMetroCuadrado=" + precioPorMetroCuadrado +
                ", numeroMetrosCuadrados=" + numeroMetrosCuadrados +
                ", costoFinal=" + costoFinal +
                ", numeroCuartos=" + numeroCuartos +
                '}';
    }
}