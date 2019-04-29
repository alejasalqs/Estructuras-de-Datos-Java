/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana._alejandrosalguero;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class ListaCircular {

    private Nodo cabeza, ultimo;

    public void inserta(Producto p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
            //para que sea circular necesitamos que ultimo apunte a cabeza
            ultimo.setNext(cabeza);
        } else {
            //p.getPrecio es menor a cabeza.getDato().getPrecio()
            if (p.getPrecio() < cabeza.getDato().getPrecio()) {
                Nodo aux = new Nodo(p);
                aux.setNext(cabeza);
                cabeza = aux;
                //para que sea circular necesitamos que ultimo apunte a cabeza
                ultimo.setNext(cabeza);
            } else {
                //preguntamos si p.getPrecio es mayor que ultimo.getDato()
                if (p.getPrecio() > ultimo.getDato().getPrecio()) {
                    //insertamos el dato despues de ultimo
                    ultimo.setNext(new Nodo(p));
                    //movemos el nodo hacia el dato nuevo
                    ultimo = ultimo.getNext();
                    ultimo.setNext(cabeza);
                } else {
                    Nodo aux = cabeza;
                    //iteramos hasta estar un dato antes del que vamos a eliminar
                    while (p.getPrecio() > aux.getNext().getDato().getPrecio()) {
                        aux = aux.getNext();
                    }
                    //creamos un nodo temporal
                    Nodo temp = new Nodo(p);
                    //el siguiente del nuevo nodo es el siguiente de aux
                    temp.setNext(aux.getNext());
                    //el siguiente de aux es el nuevo nodo
                    aux.setNext(temp);
                }
            }
        }
    }

    public String toString() {
        String msj = "";

        Nodo aux = cabeza;

        if (aux != null) {
            msj += aux.getDato().toString();
            aux = aux.getNext();
            while (aux != cabeza) {
                msj += aux.getDato().toString();
                aux = aux.getNext();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        return msj;
    }

    public boolean existe(String nombre) {
        Nodo aux = cabeza;

        if (aux != null) {
            //comparamos el dato
            //el ignore case lo que hace es comparar sin importar si es mayuscula o miniscula
            if (aux.getDato().getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "El dato existe");
                return true;
            } else {
                //si no es iteramos para entrar al ciclo
                aux = aux.getNext();
                while (aux != cabeza) {
                    //comparamos de la misma manera
                    if (aux.getDato().getNombre().equalsIgnoreCase(nombre)) {
                        JOptionPane.showMessageDialog(null, "El dato existe");
                        return true;
                    }
                    aux = aux.getNext();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        JOptionPane.showMessageDialog(null, "El NO dato existe");
        return false;
    }

    //no sirve al eliminar el primero
    public void elimina(String nombre, String marca) {
        Nodo aux = cabeza;

        if (aux != null) {
            //iteramos hasta estar un nodo antes de los datos correctos
            while (!(aux.getNext().getDato().getNombre().equalsIgnoreCase(nombre)) && !(aux.getNext().getDato().getMarca().equalsIgnoreCase(marca))) {
                aux = aux.getNext();
            }
            //cuando llegamos al nodo que estoy le asigno el nodo siguiente del siguiente
            aux.setNext(aux.getNext().getNext());
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    //no pude comentar a partir de este puntp
    public String buscar(int precio) {
        Nodo aux = cabeza;
        String msj = "";
        if (aux != null) {
            while (aux.getDato().getPrecio() <= precio && aux.getNext() != cabeza) {
                msj += aux.getDato().toString();
                aux = aux.getNext();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        return msj;
    }

    public String productos(char c) {
        String msj = "";

        Nodo aux = cabeza;

        if (aux != null) {
            if (aux.getDato().getNombre().toUpperCase().charAt(0) == c) {
                msj += aux.getDato().toString();
            }
            aux = aux.getNext();
            while (aux != cabeza) {
                if (aux.getDato().getNombre().toUpperCase().charAt(0) == c) {
                    msj += aux.getDato().toString();
                    aux = aux.getNext();
                } else {
                    aux = aux.getNext();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        if (msj == "") {
            JOptionPane.showMessageDialog(null, "No hay datos");
        } else {
            JOptionPane.showMessageDialog(null, msj);
        }
        return msj;
    }
}
