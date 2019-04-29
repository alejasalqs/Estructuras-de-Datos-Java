/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import Cola.Cola;
import Lista.Lista;
import Lista.Paquetes;
import Pila.Clientes;
import Pila.NodoClientes;
import Pila.Pila;
import javax.swing.JOptionPane;

/**
 *
 * @author AlejandroSalguero
 */
public class EstructurasBasicas {

    //creamos estructuras básicas
    static Pila pilaClientes = new Pila();
    static Lista listaPaquetes = new Lista();
    static Cola colaBusetas = new Cola();

    public void agregarPaqueteLista(Paquetes p) {
        //revisamos la cantidad de paquets
        if (listaPaquetes.largo() < 5) {
            //si hay menos de 5 se ingresa uno nuevo
            listaPaquetes.inserta(p);
            listaPaquetes.insetarBusetaEnLista(p.getLugarViaje());
        } else {
            //Si hay más de 5 se elimina el ultimo
            listaPaquetes.eliminarUltimo(p);
        }
    }

    public void insertarPrimerosRegistros() {
        //metodo que ingresa los primeros datos
        Cola guanacaste = new Cola();
        Cola puntarenas = new Cola();
        Cola limon = new Cola();

        listaPaquetes.inserta(new Paquetes("Guanacaste", "Actividades marinas", guanacaste, 0));
        listaPaquetes.inserta(new Paquetes("Puntarenas", "Actividades deportivas", puntarenas, 0));
        listaPaquetes.inserta(new Paquetes("Limón", "Actividades musicales", limon, 0));
        listaPaquetes.insetarBusetaEnLista("Guanacaste");
        listaPaquetes.insetarBusetaEnLista("Puntarenas");
        listaPaquetes.insetarBusetaEnLista("Limón");
        listaPaquetes.insertarEnColaCorrespondiente("Guanacaste", new Clientes("Juan", "Reyes", 88903412, 3));
        listaPaquetes.insertarEnColaCorrespondiente("Puntarenas", new Clientes("Maria", "cedeño", 88670925, 6));
        listaPaquetes.insertarEnColaCorrespondiente("Limón", new Clientes("Lucrecia", "brenes", 40892019, 1));
    }

    public Lista devuelveListaPaquetesCompleta() {
        return listaPaquetes;
    }

    public String[] devuelveArrayListPaquetesCompleta() {
        //creamos el arrayList de paquetes
        String[] paquetes;
        //rellenamos datos
        paquetes = listaPaquetes.toArray(listaPaquetes, listaPaquetes.largo());
        //comparamos lista para ver si se actualiza la info
        if (paquetes == listaPaquetes.toArray(listaPaquetes, listaPaquetes.largo())) {
            JOptionPane.showMessageDialog(null, "La lista esta actualizada");
            return null;
        } else {
            return paquetes;
        }
    }

    public void insertarEnCola(String destino, Clientes c) {
        //puente para llamar el metodo insertarEnColaCorrespondiente
        listaPaquetes.insertarEnColaCorrespondiente(destino, c);
    }
    
    public String toStringColas(){
        //puente para llamar el metodo toStringColas
        return listaPaquetes.toStringColas();
    }
}
