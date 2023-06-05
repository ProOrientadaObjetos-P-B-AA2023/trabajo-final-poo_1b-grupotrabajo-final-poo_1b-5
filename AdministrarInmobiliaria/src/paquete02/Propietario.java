/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import paquete03.Barrio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Propietario {
    private String nombres;
    private String apellidos;
    private String identificacion;
    private ArrayList barrio;

    public Propietario(String nombres, String apellidos, String identificacion, ArrayList barrio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.barrio= barrio;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setBarrio(ArrayList barrio) {
        this.barrio = barrio;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public ArrayList getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return nombres +" "+ apellidos +" "+ identificacion +" "+ barrio;
    }
}
