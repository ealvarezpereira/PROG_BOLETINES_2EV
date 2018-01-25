/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej3;


/**
 *
 * @author quique
 */
public class B17ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notalumnos = new int[5];

        String
                [] alumnos = new String[5];
        Alumnos objAlumnos = new Alumnos();

        //Insertar nombres y notas
        objAlumnos.alumnoNombre(alumnos);
        objAlumnos.insertarNota(notalumnos);

        //Mostrar los alumnos
        objAlumnos.mostrarAlumnos(alumnos, notalumnos);

        //Mostrar el numero de aprobados y de suspensos
        objAlumnos.aprobadosSuspensos(notalumnos);

        //Mostrar los alumnos aprobados
        objAlumnos.alumnosAprobados(alumnos, notalumnos);

        //Calcular la nota media
        objAlumnos.calcularNotaMedia(notalumnos);

        //Mostras la nota mas alta
        objAlumnos.notaMasAlta(notalumnos);

        objAlumnos.ordenar(alumnos,notalumnos);
        
        objAlumnos.mostrarAlumnos(alumnos, notalumnos);



        objAlumnos.buscar(notalumnos, alumnos);
    }

}
