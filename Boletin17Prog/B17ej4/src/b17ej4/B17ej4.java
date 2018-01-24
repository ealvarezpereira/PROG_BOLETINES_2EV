/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej4;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B17ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalcularDNI dnii = new CalcularDNI();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca DNI");
        dnii.calculaLetra(sc.nextInt());

}
}