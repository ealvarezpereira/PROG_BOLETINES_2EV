/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b21ej1;

import java.util.ArrayList;

/**
 *
 * @author quique
 */
public class B21ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<String>();      
        Ordenacion orden = new Ordenacion();
        
        orden.pedirDatos(palabras);
        orden.ordenarArray(palabras);
        orden.escribirFichero(palabras);
        

    }
    
}
