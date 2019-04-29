/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     * Alejandro Salguero Q
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Recursividad recursividad = new Recursividad();
            String numero = JOptionPane.showInputDialog(null, "Introduce un número");
            recursividad.Imprime(Integer.parseInt(numero));
            recursividad.LLamarFactoeial(Integer.parseInt(numero));
        } catch (Exception ex)  {
            JOptionPane.showMessageDialog(null," Ingresaste un dato no válido ");
        }
    }
}
