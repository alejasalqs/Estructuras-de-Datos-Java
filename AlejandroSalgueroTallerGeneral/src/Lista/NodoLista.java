/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author AlejandroSalguero
 */
public class NodoLista {

    /*creacion de los nodos contenedotes de los paquetes para ingresarlos a la lista*/
    private Paquetes dato;
    private NodoLista next, back;

    public NodoLista(Paquetes dato) {
        this.dato = dato;
    }

    public Paquetes getDato() {
        return dato;
    }

    public void setDato(Paquetes dato) {
        this.dato = dato;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

}
