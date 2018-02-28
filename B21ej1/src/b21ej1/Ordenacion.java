/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b21ej1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Ordenacion {

    public void pedirDatos(ArrayList<String> pala) {

        for (int i = 0; i < 5; i++) {

            String palabras = JOptionPane.showInputDialog("Introduzca la palabra " + (i+1));

            pala.add(palabras);

        }
    }

    public void ordenarArray(ArrayList<String> pala) {

        Collections.sort(pala);

    }

    File fich;

    public void escribirFichero(ArrayList<String> pala) {

        PrintWriter escribir = null;

        fich = new File("palabras.txt");

        try {
            
            escribir = new PrintWriter(new FileWriter(fich, true));
            
            for (int i = 0; i < pala.size(); i++) {
                
                escribir.println((i+1)+".- "+pala.get(i));
            }
            
            
        } catch (IOException ex) {
            System.out.println("Error "+ex);
        } finally {
            escribir.close();
        }

    }

}
