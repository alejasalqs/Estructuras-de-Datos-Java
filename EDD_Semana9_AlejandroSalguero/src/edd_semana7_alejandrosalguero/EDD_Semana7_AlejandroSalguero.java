/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_semana7_alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class EDD_Semana7_AlejandroSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        arbol.inserta(45);
        arbol.inserta(20);
        arbol.inserta(30);
        arbol.inserta(25);
        arbol.inserta(61);
        arbol.inserta(90);
        arbol.inserta(33);
        arbol.inserta(82);
        arbol.inserta(18);
        arbol.inserta(50);
        arbol.preOrden();
        arbol.inOrden();
        arbol.postOrden();
    }

}
