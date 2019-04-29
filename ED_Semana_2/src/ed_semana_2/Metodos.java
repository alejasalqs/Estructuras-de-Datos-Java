/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Salguero
 */
public class Metodos {

    public void ingresaNumeroFibonacci() {
        try {
            int numeroEvaluar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la función Fibonacci"));
            if (numeroEvaluar != 0) {
                JOptionPane.showMessageDialog(null, "El resultado de la función Fibonacci es " + funcionFubonacci(numeroEvaluar));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ingresa un dato valido");
        }
    }

    private int funcionFubonacci(int n) {
        int resultado = 1;
        if (n >= 0) {//mientras que n sea cierta vamos a probar la formula, en cuanto sea falso retornamos el resultado y finalizamos
            resultado = funcionFubonacci(n - 1) + funcionFubonacci(n - 2);
            return resultado;
        }

        return resultado;
    }

    public void ingresaNumerosResta() {
        try {
            int dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dividendo"));
            int divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el divisor"));

            if (divisor != 0 && dividendo != 0) {
                JOptionPane.showMessageDialog(null, "La división de " + dividendo + " entre " + divisor + " da como resultado: " + divisionPorRestas(divisor, dividendo, 0));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ingresa un dato valido");
        }
    }

    private int divisionPorRestas(int divisor, int dividendo, int cantidad) {
        if (dividendo - divisor >= 0) {//mientras que la resta sea mayor a 0 vamos a realizarla y cuando no cumpla se termina el metodo

            return divisionPorRestas(divisor, dividendo - divisor, cantidad + 1);
        }

        return cantidad;
    }

    public void ingreseNumeroBinario() {
        try {
            int numeroBinario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número binario"));
            String numeroBinariostring = String.valueOf(numeroBinario);
            if(numeroBinariostring.contains("2") || numeroBinariostring.contains("3") || numeroBinariostring.contains("4") || numeroBinariostring.contains("5") || numeroBinariostring.contains("6") || numeroBinariostring.contains("7") || numeroBinariostring.contains("8") || numeroBinariostring.contains("9")){
                JOptionPane.showMessageDialog(null, "Ingresa un número binario válido");
                return;
            }
            int matrizBinaria[];
            matrizBinaria = new int[numeroBinariostring.length()];

            int matrizResultados[];
            matrizResultados = new int[numeroBinariostring.length()];

            for (int i = 0; i < numeroBinariostring.length(); i++) {
                int j = Character.digit(numeroBinariostring.charAt(i), 10);
                matrizBinaria[i] = j;
            }
            matrizResultados = binarioADecimal(matrizBinaria, matrizBinaria.length, 0, matrizResultados);
            int aux = 0;
            for (int i = 0; i < matrizResultados.length; i++) {
                if (aux == 0) {
                    aux = matrizResultados[i];
                } else {
                    aux = aux + matrizResultados[i];
                }
            }
            JOptionPane.showMessageDialog(null, "El némero binario " + numeroBinario + " en base 10 es " + aux);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido");
        }
    }

    private int[] binarioADecimal(int[] matrizBinaria, int longitud, int multipicador, int[] matrizResultados) {
        if (longitud != 0) {//necesitamos controlar la longitud de la matriz para llenar la otra, entonces cuando la longitud e la primera matriz sea 0 terminamos de hacer operaciones
            matrizResultados[longitud - 1] = matrizBinaria[longitud - 1] * (int) Math.pow(2, multipicador);//Math.pow(); devuelve la potencia del número
            return binarioADecimal(matrizBinaria, longitud - 1, multipicador + 1, matrizResultados);
        }

        return matrizResultados;
    }

    public void hanoi(int discos, String origen, String aux, String destino) {
        if(discos == 3){ //preguntamos el disco que tenemos y le decimos donde tiene que mover
            System.out.println(origen+ "->" +destino);
            hanoi(discos-1,origen,aux,destino);
        }
        if(discos == 2){
            System.out.println(origen+ "->" +aux);
            hanoi(discos-1,origen,aux,destino);
        }
        if(discos == 1){
            System.out.println(aux+ "->" +destino);
            hanoi(discos-1,origen,aux,destino);
        }
    }
}
