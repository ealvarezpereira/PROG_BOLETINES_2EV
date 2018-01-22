/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b17ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Notas {

    private double media = 0.0;
    private double mediafinal;
    private double a, b, c;

    public void insertarNota(int not[]) {

        for (int i = 0; i < not.length; i++) {
            int notas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno " + (i + 1)));
            while (notas < 0 || notas > 10) {
                notas = Integer.parseInt(JOptionPane.showInputDialog("Nota inválida. Inserte la nota."));
            }
            not[i] = notas;
            System.out.println("Alumno " + (i + 1) + ", Nota: " + not[i]);

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
        System.out.println("Nota mas alta: "+a);
    }

    
    
}
