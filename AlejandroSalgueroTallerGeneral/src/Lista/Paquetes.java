/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import Cola.Cola;

/**
 *
 * @author AlejandroSalguero
 */
public class Paquetes {

    /*Creacion de los paquetesF*/
    private String lugarViaje, actividades;
    private int cantidadPaquetesVendidos;
    private Cola busetas;

    public Paquetes(String lugarViaje, String actividades, Cola busetas, int cantidadPaquetesVendidos) {
        this.lugarViaje = lugarViaje;
        this.actividades = actividades;
        this.busetas = busetas;
        this.cantidadPaquetesVendidos = cantidadPaquetesVendidos;
    }

    public String getLugarViaje() {
        return lugarViaje;
    }

    public void setLugarViaje(String lugarViaje) {
        this.lugarViaje = lugarViaje;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public Cola getBusetas() {
        return busetas;
    }

    public void setBusetas(Cola busetas) {
        this.busetas = busetas;
    }

    public int getCantidadPaquetesVendidos() {
        return cantidadPaquetesVendidos;
    }

    public void setCantidadPaquetesVendidos(int cantidadPaquetesVendidos) {
        this.cantidadPaquetesVendidos = cantidadPaquetesVendidos;
    }

    @Override
    public String toString() {
        return "Información Paquete\n Destino: " + lugarViaje + ", Actividades: " + actividades + ", Busetas: " + busetas + ", Paquetes Vendidos: " + cantidadPaquetesVendidos + '\n';
    }

}
