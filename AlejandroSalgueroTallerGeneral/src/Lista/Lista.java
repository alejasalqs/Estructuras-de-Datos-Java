/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import Cola.Busetas;
import Cola.Cola;
import Cola.NodoBusetas;
import Pila.Clientes;
import javax.swing.JOptionPane;

/**
 *
 * @author AlejandroSalguero
 */
public class Lista {

    private NodoLista cabeza, ultimo;
    private Cola busetas;

    public void inserta(Paquetes p) {
        //preguntamos si cabeza es null para saber si esta vacio o no
        if (cabeza == null) {
            //Creamos el objeto y le asignamos a cabeza
            cabeza = new NodoLista(p);
            ultimo = cabeza;
        } else {
            if (p.getCantidadPaquetesVendidos() >= cabeza.getDato().getCantidadPaquetesVendidos()) {
                //como el dato se va a guardar a la izquierda entonces lo creamos como la izquierda de cabeza
                //por lo que decimos que es el back de cabeza
                cabeza.setBack(new NodoLista(p));
                //a la vez decimos que el siguiente de cabeza.getBack va a ser cabeza
                cabeza.getBack().setNext(cabeza);
                //cambiamos el puntero de cabeza
                cabeza = cabeza.getBack();
            } else {
                //preguntamos si el nuevo juego es mayor a ultimo para agregarlo al final
                if (p.getCantidadPaquetesVendidos() <= ultimo.getDato().getCantidadPaquetesVendidos()) {
                    ultimo.setNext(new NodoLista(p));
                    ultimo.getNext().setBack(ultimo);
                    ultimo = ultimo.getNext();
                } else {
                    //si el dato es menor que ultimo
                    NodoLista aux = cabeza;
                    //iteramos hasta esta en el dato que es mayor al que vamos a ingresar
                    while (p.getCantidadPaquetesVendidos() >= aux.getDato().getCantidadPaquetesVendidos()) {
                        aux = aux.getNext();
                    }
                    NodoLista temp = new NodoLista(p);
                    temp.setNext(aux);
                    temp.setBack(aux.getBack());

                    aux.setBack(temp);
                    temp.getBack().setNext(temp);
                }
            }
        }
        //decimos que el siguiente de ultimo es cabeza para que sea circular
        //lo ponemos antes de que se acabe del metodo para asi asegurar que se cumpla en todas las decisiones
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
    }

    public String toString() {
        String msj = "";
        NodoLista aux = cabeza;

        if (cabeza != null) {
            //concatenamos los mensajes
            msj += cabeza.getDato().toString();
            aux = aux.getNext();
            while (aux != cabeza) {
                //iteramos a los nuevos registros y seguimos concatenando mensajes
                msj += aux.getDato().toString();
                aux = aux.getNext();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
        //retornamos el resultado
        return msj;
    }

    public String[] toArray(Lista lista, int largo) {
        //definimos variable de inicio
        NodoLista aux = cabeza;
        //creamos un arraylist para guardar los datos
        String[] listaArray = new String[largo];
        try {
            for (int i = 0; i < largo; i++) {
                if (aux != null) {
                    //agregamos los destinos al arrayList
                    listaArray[i] = aux.getDato().getLugarViaje();
                    aux = aux.getNext();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay datos sobre el menu");
        }

        //retornamos lo informacion
        return listaArray;
    }

    public int largo() {
        NodoLista aux = cabeza;
        int contador = 0;
        if (cabeza != null) {
            //aumentamos el contador e iteramos
            contador++;
            aux = aux.getNext();
            while (aux != cabeza) {
                //aumentamos el contador e iteramos
                contador++;
                aux = aux.getNext();
            }
        } else {
            //vacio
        }

        //retornamos el resultado
        return contador;
    }

    public void aumentarVenta(String paquete, int cantidadVenta) {
        NodoLista aux = cabeza;

        if (cabeza != null) {
            //filtramos por el destino
            if (cabeza.getDato().getLugarViaje().equalsIgnoreCase(paquete)) {
                //cuando sabemos que destino es, tomamos el dato y le agregamos la cantidad vendida
                cabeza.getDato().setCantidadPaquetesVendidos(cantidadVenta);

            } else {
                //si el destiono no esta en la cabeza iteramos al siguiente dato
                aux = aux.getNext();
                while (aux != cabeza) {
                    //filtramos de nuevo por destino
                    if (aux.getDato().getLugarViaje().equalsIgnoreCase(paquete)) {
                        //agregamos la venta
                        aux.getDato().setCantidadPaquetesVendidos(cantidadVenta);
                    }
                    aux = aux.getNext();
                }
            }
        } else {
            //lista vacia
        }
    }

    public void insertarEnColaCorrespondiente(String destino, Clientes c) {
        NodoLista aux = cabeza;

        if (cabeza == null) {
            //insertamos el nuevo cliente dentro de la cola
            cabeza.getDato().getBusetas().insertarClienteEnBuseta(c, c.getCantidadPaquetes(), destino, aux.getDato().getBusetas());
            //aumentamos la cantidad de paquetes vendidos
            cabeza.getDato().setCantidadPaquetesVendidos(cabeza.getDato().getCantidadPaquetesVendidos() + c.getCantidadPaquetes());

        } else {
            //si ya habian datos en la cabeza entonces filtramos por destino
            if (aux.getDato().getLugarViaje().equalsIgnoreCase(destino)) {
                //y hacemos el mismo proceso de ingresar el cliente y actualizar los campos del paquete
                aux.getDato().getBusetas().insertarClienteEnBuseta(c, c.getCantidadPaquetes(), destino, aux.getDato().getBusetas());
                cabeza.getDato().setCantidadPaquetesVendidos(aux.getDato().getCantidadPaquetesVendidos() + c.getCantidadPaquetes());
            } else {
                //si el campo tampoco era la cabeza iteramos y seguimos repitiendo el procesos ya dicho
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (aux.getDato().getLugarViaje().equalsIgnoreCase(destino)) {
                        aux.getDato().getBusetas().insertarClienteEnBuseta(c, c.getCantidadPaquetes(), destino, aux.getDato().getBusetas());
                        aux.getDato().setCantidadPaquetesVendidos(aux.getDato().getCantidadPaquetesVendidos() + c.getCantidadPaquetes());
                    }
                    aux = aux.getNext();
                }
            }
        }
    }

    public void insetarBusetaEnLista(String destino) {
        NodoLista aux = cabeza;
        if (cabeza != null) {
            //filtramos por destino
            if (aux.getDato().getLugarViaje().equalsIgnoreCase(destino)) {
                //cuando encontramos coincidencia ingresamos 2 busetas nuevas
                aux.getDato().getBusetas().encola(new NodoBusetas(new Busetas(destino, 1, 0, null)));
                aux.getDato().getBusetas().encola(new NodoBusetas(new Busetas(destino, 2, 0, null)));
            } else {
                //si el destino no estaba en la cabeza iteramos al siguiente datos
                aux = aux.getNext();
                while (aux != cabeza) {
                    //filtramos de nuevo el destino
                    if (aux.getDato().getLugarViaje().equalsIgnoreCase(destino)) {
                        //agregamos los datos
                        aux.getDato().getBusetas().encola(new NodoBusetas(new Busetas(destino, 1, 0, null)));
                        aux.getDato().getBusetas().encola(new NodoBusetas(new Busetas(destino, 2, 0, null)));
                    }
                    aux = aux.getNext();
                }
            }
        } else {
            //lista vacia
        }
    }

    public String toStringColas() {
        //utilizamos el mismo metodo toString de la lista y de cola para poder tener la informacion y mostrarla
        String msj = "";
        NodoLista aux = cabeza;

        if (cabeza != null) {
            msj = msj + cabeza.getDato().getBusetas().toString();
            aux = aux.getNext();
            while (aux != cabeza) {
                msj = msj + aux.getDato().getBusetas().toString();
                aux = aux.getNext();
            }
        } else {
        }

        return msj;
    }

    public void eliminarUltimo(Paquetes p) {
        //primero eliminamos la cola de busetas
        ultimo.getDato().getBusetas().revisaSiLaBusetaPuedeSalir(ultimo.getDato().getBusetas(), true, 0);
        //luego eliminamos el paquete turistico
        ultimo.getDato().getBusetas().atiende();
        //agregamos el nuevo dato
        inserta(p);
    }
}
