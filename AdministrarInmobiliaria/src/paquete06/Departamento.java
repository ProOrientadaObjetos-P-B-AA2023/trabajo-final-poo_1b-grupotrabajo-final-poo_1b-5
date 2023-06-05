/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Departamento {
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private String nombreEdificio;
    private String ubicacionDepartamentoE;

    public Departamento(double precioMetroCuadrado, double numeroMetrosCuadrados, double valorAlicuotaMensual, String ubicacionDepartamentoE, String nombreEdificio) {
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.nombreEdificio = nombreEdificio;
        this.ubicacionDepartamentoE = ubicacionDepartamentoE;
    }


    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public void setValorAlicuotaMensual(double valorAlicuotaMensual) {
        this.valorAlicuotaMensual = valorAlicuotaMensual;
    }

    public void calcularCostoFinal(){
        this.costoFinal= (this.numeroMetrosCuadrados*this.precioMetroCuadrado)+(valorAlicuotaMensual*12);
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public void setUbicacionDepartamentoE(String ubicacionDepartamentoE) {
        this.ubicacionDepartamentoE = ubicacionDepartamentoE;
    }


    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public double getValorAlicuotaMensual() {
        return valorAlicuotaMensual;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public String getUbicacionDepartamentoE() {
        return ubicacionDepartamentoE;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "precioMetroCuadrado=" + precioMetroCuadrado +
                ", numeroMetrosCuadrados=" + numeroMetrosCuadrados +
                ", valorAlicuotaMensual=" + valorAlicuotaMensual +
                ", costoFinal=" + costoFinal +
                ", nombreEdificio='" + nombreEdificio + '\'' +
                ", ubicacionDepartamentoE='" + ubicacionDepartamentoE + '\'' +
                '}';
    }
}
