/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej4;

/**
 *
 * @author quique
 */
public class CalcularDNI {
    
//He ordenado las letras por su resto y las he puesto todas en orden.
//Si la T tiene el resto 0 y la E el resto 23, puse el resto de letras en orden ascendente
//Con el metodo charAt si le pasas un valor te devuelve la posicion que ocupa en la cadena String
//Al dividir el dni entre 23 te da la posicion y con esa posicion te devuelve la letra
    
    public void  calculaLetra(int dni) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        System.out.println("DNI: "+dni+letra);
    }
}
