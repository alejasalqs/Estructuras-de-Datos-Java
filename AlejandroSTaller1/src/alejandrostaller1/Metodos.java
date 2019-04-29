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
            String numero = String.valueOf(n); //creamos una variable string, le asignamos n convertido de int a string
            int matrizNumeros[]; //creamos una matriz vacia
            matrizNumeros = new int[numero.length()]; 
            for (int i = 0; i < numero.length(); i++) {//en el ciclo recorremos lo longitud de numero 
                int j = Character.digit(numero.charAt(i), 10);//tomamos el indice y lo pasamos de nuevo a int para agregarlo a la matrizNumeros
                matrizNumeros[i] = j;
            }
            imprimePosicion(matrizNumeros, matrizNumeros.length, 1);
        } catch (Exception e) {
        }
    }

    private void imprimePosicion(int[] n, int posicion, int conteo) {

        if (posicion - 1 >= 0) {//evaluamos que la posicion no sea menor que 0 para evitar excepciones
            System.out.println("Posción " + conteo + " es: " + n[posicion - 1] + "\n");//empezamos a recorreo de atras hacia adelante para asi imprimir en orden los numeros
            imprimePosicion(n, posicion - 1, conteo + 1);//llamamos de nuevo
        }
    }

    public void ingresaNumeroArreglo() {
        int[] numerosArreglo;
        numerosArreglo = new int[5];//creamos un arreglo de 5 longitud
        for (int i = 0; i < numerosArreglo.length; i++) {
            numerosArreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + i + " número para el arreglo"));//llenamos el arreglo con los datos del JOptionPane
        }
        int numeroEncontrado = buscaNumeroRecursivo(numerosArreglo, numerosArreglo.length, Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que va a buscar en el arreglo")));
        JOptionPane.showMessageDialog(null, "El número que buscaste fue " + numeroEncontrado);
        int sumatoria = sumaNumeroRecursivo(numerosArreglo, numerosArreglo.length, 0);
        JOptionPane.showMessageDialog(null, "La suma de los números del vector es " + sumatoria);
    }

    private int buscaNumeroRecursivo(int[] numeroArreglo, int longitudArreglo, int numeroBuscar) {
        if (numeroArreglo[longitudArreglo - 1] != numeroBuscar) { //Comparamos el número a buscar con el dato que esta actualmente el indice
            return buscaNumeroRecursivo(numeroArreglo, longitudArreglo - 1, numeroBuscar);//si no es llamamos de nuevo
        }
        return numeroArreglo[longitudArreglo - 1];//si es la condicion no se cumple y se retorna el valor
    }

    private int sumaNumeroRecursivo(int[] numeroArreglo, int longitudArreglo, int numeroTotal) {
        try {
            if (numeroArreglo[longitudArreglo - 1] > 0) {//verificamos que no sea menor   a 0
                int aux = numeroArreglo[longitudArreglo - 1];//asignamos el valor actual
                if (numeroTotal == 0) {//si el numeroTotal es 0 le asignamos el valor actual y llamamos de nuevo
                    numeroTotal = aux;
                    return sumaNumeroRecursivo(numeroArreglo, longitudArreglo - 1, numeroTotal);
                } else if (numeroArreglo[longitudArreglo - 1] >= 0) {//si no, tomamos el numeroTotal y le sumamos el numero actual, asi hasta que se llegue al final del arreglo y retorne el valor de la suma
                    numeroTotal = numeroTotal + aux;
                    return sumaNumeroRecursivo(numeroArreglo, longitudArreglo - 1, numeroTotal);
                }
            }

            return numeroTotal;
        } catch (Exception e) {
            return numeroTotal;
        }
    }
}
