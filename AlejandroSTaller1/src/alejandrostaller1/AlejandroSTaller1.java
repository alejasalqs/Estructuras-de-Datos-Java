/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrostaller1;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author Xtreme Pc
 */
public class AlejandroSTaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Metodos metodos = new Metodos();
            metodos.ingresaNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero")));
            metodos.ingresaNumeroArreglo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresaste un dato no válido");
        }
    }

}
