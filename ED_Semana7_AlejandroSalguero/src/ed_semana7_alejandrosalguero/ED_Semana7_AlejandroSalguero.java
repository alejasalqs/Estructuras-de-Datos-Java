/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana7_alejandrosalguero;

import ed_semana7_alejandrosalguero.ListaDobleCircular;
import ed_semana7_alejandrosalguero.Juego;
import java.io.Console;
import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class ED_Semana7_AlejandroSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ListaDobleCircular lista = new ListaDobleCircular();
            lista.inserta(new Juego("Pokemon", "Nintendo", 1997));
            lista.inserta(new Juego("Castlevania", "PS1", 1990));
            lista.inserta(new Juego("Fallout", "PC", 2005));
            lista.inserta(new Juego("Residen Evil", "PS1", 2003));
            lista.inserta(new Juego("Smash Bros", "Nintendo", 1998));
            lista.inserta(new Juego("Crash", "PS1", 1994));
            lista.inserta(new Juego("Mario", "Nintendo", 1983));
            lista.inserta(new Juego("Dino Crisis", "PS1", 2001));
            lista.inserta(new Juego("Mario", "Nintendo", 2009));
            System.out.println(lista.toString());
            lista.existe(JOptionPane.showInputDialog("Ingrese el nombre a buscar"));
            lista.modifica(JOptionPane.showInputDialog("Ingrese el nombre a modificar"), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año a buscar")));
            lista.elimina(JOptionPane.showInputDialog("Ingrese el nombre a eliminar"), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año a eliminar")));
            System.out.println(lista.toString());
            System.out.println(lista.imprimeDescendente());
            lista.cuentaNombres(JOptionPane.showInputDialog("Ingrese el nombre a buscar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Favor ingrese un dato válido");
        }
    }
}
