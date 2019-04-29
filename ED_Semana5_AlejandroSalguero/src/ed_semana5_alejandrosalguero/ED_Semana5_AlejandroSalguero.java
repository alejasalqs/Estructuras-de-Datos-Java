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
public class ED_Semana5_AlejandroSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Lista lista = new Lista();
            lista.insertar(new Pelicula("Señor de los anillos", "JJ", 300, 2001));
            lista.insertar(new Pelicula("2012", "JJ", 450, 2012));
            lista.insertar(new Pelicula("batman", "JJ", 200, 1995));
            lista.insertar(new Pelicula("Matrix", "Rambo", 500, 1997));
            lista.insertar(new Pelicula("Glass", "Steven Spielger", 120, 2019));

            System.out.println("Lista orignal: \n"+lista.toString());

            lista.existe(JOptionPane.showInputDialog("Ingrese el titulo de la pelicula"));
            lista.elimina(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la pelicula para eliminar")));

            System.out.println("Lista despues del método elimina: \n"+lista.toString());

            lista.muestra(JOptionPane.showInputDialog("Ingrese el nombre del director de la pelicula"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresaste un dato inválido, por favor intenta de nuevo");
        }
    }

}
