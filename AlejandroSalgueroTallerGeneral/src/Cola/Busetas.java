/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import Pila.Pila;

/**
 *
 * @author AlejandroSalguero
 */
public class Busetas {
    /*Creacion del objeto de busetas*/
    private String destino;
    private int prioridad, campos;
    private Pila pasajeros;

    public Busetas(String destino, int prioridad,int campos, Pila pasajeros) {
        this.destino = destino;
        this.prioridad = prioridad;
        this.campos = campos;
        this.pasajeros = pasajeros;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Pila getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pila pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "\n{Busetas Destino: " + destino + ", Prioridad: " + prioridad + ", Campos: " + campos + ", Pasajeros: " + pasajeros + "}";
    }


    
    
}
