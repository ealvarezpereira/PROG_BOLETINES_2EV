/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b20ej1;

import com.quique.libreria.Libreria;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class B20ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libreria lib = new Libreria();
        int op = 1;

        while (op != 0) {

            String[] menu = {"Salir", "Añadir Libro", "Consultar Libro", "Visualizar Libros", "Borrar Libro", "Modificar Libro"};

            op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Librería", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, menu, null);

            switch (op) {

                case 0:
                    op = 0;
                    System.exit(op);
                    break;
                case 1:
                    lib.insertarLibro();
                    break;

                case 2:
                    lib.consultarLibro();
                    break;

                case 3:
                    lib.visualizarLibros();
                    break;
                case 4:
                    lib.borrarLibro();
                    break;
                    
                case 5:
                    lib.modificarLibro();
                    break;
                default:
                    System.out.println("Error.");
                    break;

            }
        }

    }

}
