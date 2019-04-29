/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana4_alejandrosalguero;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class ED_Semana4_AlejandroSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Cola cola = new Cola();
            cola.encola(new Nodo(new Auto("BMW", "G6", 2010, 5)));
            cola.encola(new Nodo(new Auto("Toyota", "RAV4", 1997, 7)));
            cola.encola(new Nodo(new Auto("Honda", "Civic", 2019, 2)));
            cola.encola(new Nodo(new Auto("Hyundai", "Elantra", 2000, 5)));
            cola.encola(new Nodo(new Auto("Nissan", "Almera", 2030, 4)));
            //cola.encuentra(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para buscar")));
            //System.out.println("Cola después de ejecutar el método encola: \n"+cola.toString());

            //cola.extrae(JOptionPane.showInputDialog("Ingrese el modelo para extraer"));
            //System.out.println("Cola después de ejecutar el método extrae: \n"+cola.toString());
            
            System.out.println(cola.ordenaAscendente());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingresaste un dato no válido");
        }
    }
}
