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
public class ED_Semana_AlejandroSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCircular lista = new ListaCircular();
        lista.inserta(new Producto("Jabon", "patito", 3000));
        lista.inserta(new Producto("Cepillo", "patito2", 4000));
        lista.inserta(new Producto("Zanahorias", "patito3", 2000));
        lista.inserta(new Producto("Pepinos", "patito4", 1000));
        lista.inserta(new Producto("Papel", "patito5", 3500));
        System.out.println(lista.toString());
        lista.existe(JOptionPane.showInputDialog("ingrese el nombre del dato a buscar"));
        lista.elimina(JOptionPane.showInputDialog("ingrese el nombre del dato a eliminar"), JOptionPane.showInputDialog("ingrese la marca del dato a eliminar"));
        System.out.println("------------------------------------");
        System.out.println(lista.toString());
        System.out.println(lista.buscar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"))));
        System.out.println(lista.productos(JOptionPane.showInputDialog("Ingrese la inicial").toUpperCase().charAt(0)));
    }

}
