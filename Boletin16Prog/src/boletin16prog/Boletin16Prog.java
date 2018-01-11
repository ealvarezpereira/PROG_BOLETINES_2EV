/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16prog;

import calcularnotas.CalcularNotas;
import com.quique.academia.Personal;


/**
 *
 * @author quique
 */
public class Boletin16Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personal pers1 = new Personal("665334223","aaa@bbb.ccc");
        Academica aca1 = new Academica("Quique",pers1);        
        CalcularNotas.calcularNotas();       
        System.out.println(aca1.toString());
        
        
        Personal pers2 = new Personal("665435435","wololo@bbb.ccc");
        Academica aca2 = new Academica("Alejandro",pers2);        
        CalcularNotas.calcularNotas();       
        System.out.println("\n"+aca2.toString());
        
        
        
        
    }
    
}
