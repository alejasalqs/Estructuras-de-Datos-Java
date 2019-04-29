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
 * Alejandro Salguero Q
 */
public class Recursividad {

    //Semana 1: Recursividad
    //Los métodos recursivos son siempre privados
    public void Imprime(int x) {
        try {
            if (x > 0) {
                Imprime(x - 1); // imprime de 1 a 5
                System.out.print("El número es: " + x + "\n");
                //Imprime(x-1); //Imprime de 5 a 1
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal mientras se ralizaba la operación");
        }
    }

    public void LLamarFactoeial(int n) {
        //Recibe los datos del usuario
        //Valida datos para evitar excepciones futuras
        //Si el valor es permitido llama el método recursivo
        //Si es incorrecto avisa al usuario que el rango no es aceptado

        try {
            if ((n > 0) && (n != 0)) {//validamos que n sea mayor a 0 y que a la vez sea diferente a 0,  si cumple llama al método recursivo
                System.out.print("La función factorial es: " + FuncionFactorial(n) + "\n");
            } else {
                JOptionPane.showMessageDialog(null, "El valor " + n + " no está dentro del rango que pueda resolver esta función");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal mientras se ralizaba la operación");
        }

    }

    private int FuncionFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * FuncionFactorial(n - 1);
        }
    }
}
