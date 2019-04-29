/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana_2;

/**
 *
 * @author Alejandro Salguero
 */
public class ED_Semana_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos metodos = new Metodos(); //Invocacion de los metodos necesarios
        metodos.ingresaNumeroFibonacci();
        metodos.ingresaNumerosResta();
        metodos.ingreseNumeroBinario();
        metodos.hanoi(3, "A", "B", "C");
    }
    
}
