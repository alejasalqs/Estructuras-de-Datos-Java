/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import Pila.Clientes;
import Pila.NodoClientes;
import Pila.Pila;
import javax.swing.JOptionPane;

/**
 *
 * @author AlejandroSalguero
 */
public class Cola {

    private NodoBusetas frente, ultimo;
    private Pila clientes;

    //Añade datos a la cola
    public void encola(NodoBusetas n) {
        if (frente == null) {
            //si es el primer dato que se ingresa frente y ultimo son el mismo dato
            frente = n;
        } else {
            ultimo.setAtras(n);
        }
        ultimo = n;
    }

    //Elimina datos
    public NodoBusetas atiende() {
        //cremos un auxiliar para guardar el dato
        NodoBusetas aux = frente;
        //validamos que frente tenga datos
        if (aux != null) {
            //decimo que el dato de atras es el frente
            frente = frente.getAtras();
            //borramos las conexciones de aux
            aux.setAtras(null);
            //preguntamos de nuevo que frente sea nulo
            if (frente == null) {
                //si es nulo significa que era el ultimo dato, por lo que la lista esta vacia y borramos ultimo
                ultimo = null;
            }
        }
        return aux;
    }

    //imprime
    public String toString() {
        String msj = "";
        //aux se convierte en el frente de la cola
        NodoBusetas aux = frente;

        //empezamos a iterar hasta que aux sea nulo
        while (aux != null) {
            //concatenamos los datos a la variable final
            msj = msj + aux.getDato().toString();
            //si es el ultimo dato aux se iguala a nulo para terminar el ciclo
            aux = aux.getAtras();
        }
        return msj;
    }

    public int largo() {
        //aux se convierte en el frente de la cola
        NodoBusetas aux = frente;
        int contador = 0;
        //empezamos a iterar hasta que aux sea nulo
        while (aux != null) {
            //aumentamos el contador
            contador++;
            //Iteramos de nuevo
            aux = aux.getAtras();
        }
        return contador;
    }

    public int revisaCamposDisponibles(String destino) {
        NodoBusetas aux = frente;
        int campos = 0;
        //empezamos a iterar hasta que aux sea nulo
        while (aux != null) {
            if (aux.getDato().getDestino().equalsIgnoreCase(destino)) {
                //agregamos la informacion de los campos a una varibale
                campos = aux.getDato().getCampos();
                return campos;
            }
            aux = aux.getAtras();
        }
        //devolvemos la informacion
        return campos;
    }

    public void revisaSiLaBusetaPuedeSalir(Cola c, boolean esEliminado, int prioridad) {
        NodoBusetas aux = c.frente;

        try {
            //revisamos la prioridad de la busetas
            if (aux.getDato().getPrioridad() == prioridad) {
                //si los datos son 15 eliminamos la buseta
                if (aux.getDato().getCampos() == 15) {
                    JOptionPane.showMessageDialog(null,"La buseta se encuentra con destino a " + aux.getDato().getDestino() + "con" + aux.getDato().getPasajeros().nombreYApellido());
                    atiende();
                }
            } else {
                //si no se cumple iteramos de nuevo, seria obvio que en esta caso la prioridad es 2 por lo que no se pregunta
                aux = aux.getAtras();
                //verifiacamos los datos
                if (aux.getDato().getCampos() == 15) {
                    //eliminamos los datos
                    JOptionPane.showMessageDialog(null,"La buseta se encuentra con destino a " + aux.getDato().getDestino() + "con" + aux.getDato().getPasajeros().nombreYApellido());
                    atiende();
                } else {
                    //si es true significa que van a eliminar un paquete por lo que se muestra otro mensaje con la cantidad de campos desperdiciados
                    if (esEliminado) {
                        while (aux != null) {
                            JOptionPane.showMessageDialog(null,"La buseta se encuentra con destino a " + aux.getDato().getDestino() + "con" + aux.getDato().getPasajeros().nombreYApellido() + " y se van a desperdiciar " + (15 - aux.getDato().getCampos()) + " campos.");
                            aux = aux.getAtras();
                        }
                        //borramos la estructura
                        frente = null;
                        ultimo = null;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("La buseta a eliminar no contenia datos");
        }
    }

    public void insertarClienteEnBuseta(Clientes c, int camposRequeridos, String destino, Cola busetas) {
        NodoBusetas aux = busetas.frente;
        //la variable prioridad nos ayuda a saber a cual cola se ingresan los datos
        int prioridad = 1;

        while (aux != null) {
            //filtramos por prioridad
            if (aux.getDato().getDestino().equalsIgnoreCase(destino) && aux.getDato().getPrioridad() == prioridad) {
                //revisamo que la pila existe
                if (aux.getDato().getPasajeros() == null) {
                    //si no existe la creamos, insetamos datos y actualizamos
                    Pila clientes = new Pila();
                    clientes.push(new NodoClientes(c));
                    aux.getDato().setPasajeros(clientes);
                    aux.getDato().setCampos(c.getCantidadPaquetes());
                    revisaSiLaBusetaPuedeSalir(busetas, false, prioridad);
                } else {
                    //filtramos la prioridad
                    if (aux.getDato().getDestino().equalsIgnoreCase(destino) && aux.getDato().getPrioridad() == prioridad) {
                        //verificamos que hayan menos de  15 pasajeros
                        if ((aux.getDato().getCampos() + camposRequeridos) <= 15) {

                            //ingresamos datos
                            aux.getDato().getPasajeros().push(new NodoClientes(c));
                            aux.getDato().setCampos(c.getCantidadPaquetes());
                            revisaSiLaBusetaPuedeSalir(busetas, false, prioridad);
                        } else {
                            //iteramos
                            aux = aux.getAtras();
                            //prioridad 2 significa que vamos a ingresar datos a la nueva buseta
                            prioridad = 2;
                            if (aux.getDato().getDestino().equalsIgnoreCase(destino) && aux.getDato().getPrioridad() == prioridad) {
                                if ((aux.getDato().getCampos() + camposRequeridos) <= 15) {
                                    //vreamos la pila e ingresamos los datos
                                    Pila clientes = new Pila();
                                    clientes.push(new NodoClientes(c));
                                    aux.getDato().setPasajeros(clientes);
                                    aux.getDato().setCampos(c.getCantidadPaquetes());
                                    revisaSiLaBusetaPuedeSalir(busetas, false, prioridad);
                                }
                            }
                        }
                    }
                }
            }
            aux = aux.getAtras();
        }

    }
}
