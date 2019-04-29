/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrostaller1;

import javax.swing.JOptionPane;

/**
 *
 * @author Xtreme Pc
 */
public class Metodos {

    public void ingresaNumero(int n) {
        try {
            String number = String.valueOf(n);
            int matrizNumeros[];
            matrizNumeros = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                matrizNumeros[i] = j;
            }
            imprimePosicion(matrizNumeros, matrizNumeros.length,1);
        } catch (Exception e) {
        }
    }

    private void imprimePosicion(int[] n, int posicion, int conteo) {
        
        
        if (posicion - 1 >= 0) {
            System.out.println("Posción "+ conteo + " es: "  + n[posicion - 1] + "\n");
            imprimePosicion(n, posicion - 1, conteo + 1);
        }
    }
}
