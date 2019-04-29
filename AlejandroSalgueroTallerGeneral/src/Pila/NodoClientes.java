/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author AlejandroSalguero
 */
public class NodoClientes {
    
    /*Creacion de los nodos contenedores de los clientes*/
    
    private Clientes dato;
    private NodoClientes abajo;

    public NodoClientes(Clientes dato) {
        this.dato = dato;
    }

    public Clientes getDato() {
        return dato;
    }

    public void setDato(Clientes dato) {
        this.dato = dato;
    }

    public NodoClientes getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoClientes abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    
    
}
