/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {
    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String nombreConstructora, String idEmpresa) {
        this.nombreConstructora = nombreConstructora;
        this.idEmpresa = idEmpresa;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    @Override
    public String toString() {
        return nombreConstructora +" "+ idEmpresa;
    }
}
