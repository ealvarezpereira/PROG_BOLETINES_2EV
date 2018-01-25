/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Alumnos {

    private double media = 0.0;
    private double mediafinal;
    private double a, b, c;
    private int notas;
    private String nombres;

//    public Alumnos(int notas, String nombres) {
//        this.notas = notas;
//        this.nombres = nombres;
//    }
    public int getNotas() {
        return notas;
    }

    public String getNombres() {
        return nombres;
    }

    public void insertarNota(int not[]) {

        for (int i = 0; i < not.length; i++) {
            notas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno " + (i + 1)));
            while (notas < 0 || notas > 10) {
                notas = Integer.parseInt(JOptionPane.showInputDialog("Nota inválida. Inserte la nota."));
            }
            not[i] = notas;
            //System.out.println("Alumno " + (i + 1) + ", Nota: " + not[i]);

        }
    }

    //Este metodo esta hecho para que no permita valores numericos en el nombre
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void alumnoNombre(String nom[]) {

        for (int i = 0; i < nom.length; i++) {
            nombres = JOptionPane.showInputDialog("Introduce el nombre del alumno " + (i + 1));

            while (nombres.isEmpty() || isNumeric(nombres)) {
                nombres = JOptionPane.showInputDialog("No puedes dejar el nombre en blanco o no puede ser un número.");
            }

            nom[i] = nombres;
        }
    }

    public void mostrarAlumnos(String nom[], int not[]) {

        for (int i = 0; i < nom.length; i++) {

            System.out.println("Alumno: " + nom[i] + ", Nota: " + not[i]);
        }

    }

    public void aprobadosSuspensos(int not[]) {

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < not.length; i++) {
            if (not[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados + ", Suspensos: " + suspensos);
    }

    public void alumnosAprobados(String nom[], int not[]) {

        String aprobados;

        for (int i = 0; i < not.length; i++) {
            if (not[i] >= 5) {
                aprobados = nom[i];
                System.out.println("Aprobado: " + aprobados);
            }
        }
    }

    public void calcularNotaMedia(int not[]) {

        for (int i = 0; i < not.length; i++) {
            media = media + not[i];
        }
        mediafinal = media / not.length;

        System.out.println("Nota media: " + mediafinal);
    }

    public void notaMasAlta(int not[]) {

        a = not[0];
        for (int i = 0; i < not.length; i++) {
            if (a < not[i]) {
                a = not[i];
            }
        }
        System.out.println("Nota mas alta: " + a);
    }

    public void ordenar(String nom[], int[] not) {
        int i, j;
        int aux;
        String stringAux;
        for (i = 0; i < not.length - 1; i++) {
            for (j = i + 1; j < not.length; j++) {

                if (not[i] > not[j]) {
                    aux = not[i];
                    not[i] = not[j];
                    not[j] = aux;
                    
                    for(int k = 0; k<not.length;k++){
                    stringAux = nom[i];
                    nom[i] = nom[j];
                    nom[j] = stringAux;
                    }
                }

            }
        }
    }

    private boolean encontrado = false;

    public String buscar(int not[], String nom[]) {
        String per = JOptionPane.showInputDialog("Introduzca el nombre de la persona que quiere buscar");
        for (int i = 0; i < nom.length; i++) {
            if (nom[i].equalsIgnoreCase(per)) {
                encontrado = true;
                per = nom[i];
                System.out.println("\n\nNombre: " + nom[i] + ", Nota: " + not[i]);
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado la persona ");
        }
        return per;
    }
}
