/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana5_alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Nodo {

    private Pelicula Dato;
    private Nodo next;

    public Nodo(Pelicula Dato) {
        this.Dato = Dato;
    }

    public Pelicula getDato() {
        return Dato;
    }

    public void setDato(Pelicula Dato) {
        this.Dato = Dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "Dato=" + Dato + '}';
    }
}
