/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana3_alejandrosalguero;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Salguero
 */
public class Pila {

    private Nodo top;

    //Agrega información
    public void push(Nodo n) {
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
    public Nodo pop() {
        //Guarda información temporalmente
        Nodo aux = top;
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
        Nodo aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //Le concatenamos aux al mensaje
            msj = msj + aux;
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return msj;
    }

    public boolean encuentraPorTitulo(String titulo) {
        //Difinimos que aux sea igual a top
        Nodo aux = top;
        //Creamos esta variable para almacenar solo el titulo de el liro 
        String libroEvaluar = "";
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //Utilizamos .toUpperCase().trim() para poner las letras en mayuscula y evitar espacios en blanco
            libroEvaluar = aux.getDato().getTitulo().toUpperCase().trim();
            if (libroEvaluar.equals(titulo.toUpperCase().trim())) {
                JOptionPane.showMessageDialog(null, "Encontramos el libro " + aux);
                return true;
            }
            aux = aux.getAbajo();
        }
        JOptionPane.showMessageDialog(null, "No encontramos ningún libro con el titulo " + titulo);
        return false;
    }

    public void extraeInt() {

    }

    public void buscaLibrosAutor(String autor) {
        Nodo aux = top;
        //Creamos la variable para que sea mas facil evaluar
        String autorEvaluar;
        //esta variable sirve para definir si el autor no tiene libros registrados
        int encuentros = 0;
        while (aux != null) {
            //controlamos errores de match
            autorEvaluar = aux.getDato().getAutor().toUpperCase().trim();
            if (autorEvaluar.equals(autor.toUpperCase().trim())) {
                System.out.println("Se encontro el libro: " + aux);
                aux = aux.getAbajo();
                encuentros++;
            } else {
                aux = aux.getAbajo();
            }
        }
        //hacemos uso de la variable avisando que no hay registros
        if (encuentros == 0) {
            JOptionPane.showMessageDialog(null, "No tenemos registros del autor: " + autor);
        }
    }
}
