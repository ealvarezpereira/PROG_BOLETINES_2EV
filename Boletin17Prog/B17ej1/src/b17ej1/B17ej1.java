/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej1;

/**
 *
 * @author quique
 */
public class B17ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros objNum = new Numeros();
        int numeros[] = new int[6];

        objNum.valorarArray(numeros);
        objNum.mostrarArray(numeros);
        objNum.ordenar(numeros);
        System.out.println("\n***********\n");
        objNum.mostrarArray(numeros);
        System.out.println("\n***********\n");
        objNum.mostrarArrayReves(numeros);

    }
}
