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
public class Pila {

    private NodoClientes top;

    //Agrega información
    public void push(NodoClientes n) {
        //pregunto si top esta vacio, lo que significa que la pila esta vacia
        if (top == null) {
            //si lo esta top es n
            top = n;
        } else {
            //sino, unimos n con el dato de abajo que seria top
            n.setAbajo(top);
            //actualizamos el valor de top
            top = n;
        }
    }

    //Saca información
    public NodoClientes pop() {
        //Guarda información temporalmente
        NodoClientes aux = top;
        //revisamos que tenga información
        if (aux != null) {
            //Decimos que top es el dato de abajo
            top = top.getAbajo();
            //borramos la unión de auz
            aux.setAbajo(null);
        }
        return aux;
    }

    //Imprime Información
    public String toString() {
        String msj = "";
        //Difinimos que aux sea igual a top
        NodoClientes aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //Le concatenamos aux al mensaje
            msj = msj + aux;
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return msj;
    }
    
    public String nombreYApellido() {
        String msj = "";
        //Difinimos que aux sea igual a top
        NodoClientes aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //Le concatenamos aux al mensaje
            msj = msj + aux.getDato().getNombre() + aux.getDato().getApellido();
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return msj;
    }
    
    public int cuentaCantidadClientes(){
        int contador = 0;
        //Difinimos que aux sea igual a top
        NodoClientes aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //aumentamos el contador
            contador += 1;
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return contador;
    }
}
