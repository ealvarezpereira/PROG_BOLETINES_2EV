/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b19ej1;

import com.quique.libreria.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class B19ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> libreria = new ArrayList();

        Libreria lib = new Libreria();
        Libro libro = new Libro();

        int op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1.-Añadir libro\n2.-Vender libro\n3.-Mostrar libros"
                + "\n4.-Mostrar libros ordenados\n5.-Consultar libro\n6.-Dar de baja un libro"));

        while (op != 0) {

            switch (op) {

                case 1:
                    lib.añadirLibros(libro, libreria);
                    break;
                case 2:
                    lib.venderLibro(libro,libreria);
                    break;
                case 3:
                    System.out.println(libreria);
                    break;
                    
                case 4:
                    lib.mostrarLibros(libreria);
                    break;
                    
                case 5:
                    lib.consultarLibro(libreria);
                    break;
                case 6:
                    lib.darDeBaja(libreria);
                    break;
                    
                default:
                    System.out.println("Error.");
                    break;
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1.-Añadir libro\n2.-Vender libro\n3.-Mostrar libros"
                    + "\n4.-Mostrar libros ordenados\n5.-Consultar libro\n6.-Dar de baja un libro"));

        }
    }

}
