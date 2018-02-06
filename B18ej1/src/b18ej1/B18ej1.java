/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b18ej1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class B18ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean a = false;
        ArrayList buzon = new ArrayList();
        Buzon objBuzon = new Buzon();
        Correo objCorreo = new Correo();

        int op = Integer.parseInt(JOptionPane.showInputDialog("1.- Añadir correo\n2.- Mostrar correos\n3.- Mostrar numero de correo"
                + "\n4.- Eliminar correo\n5.-Numero total de correos\n6.- Quedan correos por leer?\n7.-Primer no leido"));

        while (op != 0) {

            switch (op) {

                case 1:

                    objBuzon.añade(objCorreo, buzon);
                    break;

                case 2:
                    System.out.println(buzon);

                    break;

                case 3:
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el correo que quiere mostrar"));
                    System.out.println(objBuzon.muestra(k, buzon));
                    break;

                case 4:

                    objBuzon.elimina(buzon);
                    break;

                case 5:
                    System.out.println("Numero total de correos: "+objBuzon.numeroDeCorreos(buzon));
                    break;

                case 6:
                    if (objBuzon.porLeer(buzon) == false) {
                        System.out.println("Hay correos sin leer en tu bandeja de entrada.");
                    } else {
                        System.out.println("Has leido todos los correos!");
                    }
                    break;
                    
                case 7:
                    System.out.println(objBuzon.muestraPrimerNoLeido(buzon));
                    break;

                default:
                    System.out.println("NO VALIDO");
                    break;
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("1.- Añadir correo\n2.- Mostrar correos\n3.- Mostrar numero de correo"
                    + "\n4.-Eliminar Correo\n5.-Numero total de correos\n6.- Quedan correos por leer?\n7.-Primer no leido"));

        }

    }

}
