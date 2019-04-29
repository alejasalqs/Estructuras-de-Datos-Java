/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrosalguerotallergeneral;

import Informacion.EstructurasBasicas;
import Vistas.Main;

/**
 *
 * @author ulacit
 */
public class AlejandroSalgueroTallerGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstructurasBasicas estructuras = new EstructurasBasicas();
        estructuras.insertarPrimerosRegistros();
        Main main = new Main();
        main.show();
        
    }
    
}
