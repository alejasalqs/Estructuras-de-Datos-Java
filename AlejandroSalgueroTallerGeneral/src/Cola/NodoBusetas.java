/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author AlejandroSalguero
 */
public class NodoBusetas {
    /*Creacion del objeto de nodos que va a guardar la informacion de las busetas en la lista*/
    private Busetas dato;
    private NodoBusetas atras;

    public NodoBusetas(Busetas dato) {
        this.dato = dato;
    }

    public Busetas getDato() {
        return dato;
    }

    public void setDato(Busetas dato) {
        this.dato = dato;
    }

    public NodoBusetas getAtras() {
        return atras;
    }

    public void setAtras(NodoBusetas atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "dato= " + dato;
    }
}
