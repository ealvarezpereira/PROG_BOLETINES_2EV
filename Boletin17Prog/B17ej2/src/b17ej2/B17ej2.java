/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej2;

/**
 *
 * @author quique
 */
public class B17ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int alumnos[] = new int[5];
        
        Notas objNotas = new Notas();
        
        objNotas.insertarNota(alumnos);
        objNotas.aprobadosSuspensos(alumnos);
        objNotas.calcularNotaMedia(alumnos);
        objNotas.notaMasAlta(alumnos);
    }
    
}
