/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana._alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Nodo {

    private Producto dato;
    private Nodo next;

    public Nodo(Producto dato) {
        this.dato = dato;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo: " + "Dato: " + dato;
    }

}
