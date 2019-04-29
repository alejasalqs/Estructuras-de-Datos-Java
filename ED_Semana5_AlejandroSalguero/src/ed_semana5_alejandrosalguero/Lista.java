/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana5_alejandrosalguero;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Lista {

    private Nodo cabeza;

    public void insertar(Pelicula p) {
        if (cabeza == null) {
            //encapsulamos p dentro de un nodo
            cabeza = new Nodo(p);
        } else {
            //comparamos si el año de p es menor que el de cabeza, si es asi p va a la izquierda de cabeza
            if (p.getYear() < cabeza.getDato().getYear()) {
                Nodo aux = new Nodo(p);
                //como esta aux va a la izquierda de cabeza entonces decimos que cabeza es el siguiente de aux
                aux.setNext(cabeza);
                //ponemos a aux como la nueva cabeza
                cabeza = aux;
            } else {
                //preguntamos si el dato que le sigue a cabeza es nulo, si lo es insertamos p
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new Nodo(p));
                } else {
                    //nos ayuda a recorrer el ciclo sin alterar datos
                    Nodo aux = cabeza;
                    //este ciclo nos ayuda a ordenar por año
                    while ((aux.getNext() != null) && (p.getYear() > aux.getNext().getDato().getYear())) {
                        aux = aux.getNext();
                    }
                    Nodo temp = new Nodo(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }

    public String toString() {
        String msj = "";

        Nodo aux = cabeza;

        while (aux != null) {
            msj = msj + aux.getDato().toString();
            aux = aux.getNext();
        }
        return msj;
    }

    public String existe(String titulo) {
        //creamos las variables que vamos a itulizar 
        String msj = "";
        Nodo aux = cabeza;
        //creamos un ciclo que recorra la lista sin alterar
        while (aux != null) {
            //validamos congreuncia de datos para utilizar el .equals
            if (aux.getDato().getTitulo().trim().toUpperCase().equals(titulo.trim().toUpperCase())) {
                //concatenamos el dato de la condicion true con la variable del msj
                msj = msj + aux.getDato();
                //mostramos un joptionpane y mandamos return para salir del metodo
                JOptionPane.showMessageDialog(null, msj);
                return msj;
            }
            //si no se cumple avanzamos
            aux = aux.getNext();
        }
        //enviamos mensaje de que no existe
        JOptionPane.showMessageDialog(null, "No encontramos una pelicula con el nombre: " + titulo);
        return msj;
    }

    public void elimina(int year) {
        Nodo aux = cabeza;
        //validamos si lo que queremos eliminar es la cabeza
        if (aux.getDato().getYear() == year) {
            cabeza = aux.getNext();
        } else {
            //si no lo es usamos la var aux para iterar la lista hasta llegar al dato previo del que queremos eliminar
            while ((aux.getNext() != null) && (aux.getNext().getDato().getYear() != year)) {
                aux = aux.getNext();
            }
            //como nosotros estamos un dato antes del que vamos a eliminar, decimos que el dato que nos sigue es el dato siguiente del siguiente para asu eliminar el dato
            aux.setNext(aux.getNext().getNext());
        }
    }

    public String muestra(String director) {
        String msj = "";
        Nodo aux = cabeza;

        //creamos ciclo para iterar la lista
        while (aux != null) {
            //usamos las validaciones de texto
            if (aux.getDato().getDirector().trim().toUpperCase().equals(director.trim().toUpperCase())) {
                //si hay coincidencia concatenamos a msj y avanzamos
                msj = msj + aux.getDato();
            }
            //si no lo hay avanzamos
            aux = aux.getNext();
        }
        //validamos que msj tenga data
        if (msj.equals("")) {
            //si no la tiene decimos que no hay registros
            JOptionPane.showMessageDialog(null, "No encontramos peliculas con el director: " + director);
        } else {
            //sino mostramos lo que se encontró
            JOptionPane.showMessageDialog(null, msj);
        }
        return msj;
    }
}
