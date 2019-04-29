/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana3_alejandrosalguero;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class ED_Semana3_AlejandroSalguero {

    /**
     * @param args the command line arguments Alejandro Salguero
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Pila pila = new Pila();
            pila.push(new Nodo(new Libro("It", "Stephen King", "IDK", 1100, 1970)));
            pila.push(new Nodo(new Libro("Como matar un ruiseñor", "Desconocido", "IDK", 550, 2010)));
            pila.push(new Nodo(new Libro("Harry Potter", "JKR", "IDK", 800, 1999)));
            pila.push(new Nodo(new Libro("El Hobbit", "JRRT", "IDK", 830, 1949)));
            pila.push(new Nodo(new Libro("El Señor de los Anillos", "JRRT", "IDK", 8000, 1929)));

            System.out.println("Pila Original: " + pila.toString());

            //pila.encuentraPorTitulo(JOptionPane.showInputDialog("Ingresa el titulo del libro"));
            pila.buscaLibrosAutor(JOptionPane.showInputDialog("Ingresa el nombre del autor"));
        } catch (Exception e) {
        }
    }
}
