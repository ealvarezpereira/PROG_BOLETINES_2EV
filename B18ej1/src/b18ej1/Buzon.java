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
public class Buzon {

    private boolean leido = false;
    private boolean todosLeidos = true;
    private String contenido;
    private String primerNoLeido;
    Correo objCorreo = new Correo();

    public int numeroDeCorreos(ArrayList buz) {

        return buz.size();
    }

    public void añade(Correo c, ArrayList<Correo> buzo) {

        String cuerpo = JOptionPane.showInputDialog("Cuerpo del correo");
        if (JOptionPane.showConfirmDialog(null, "Quieres marcar como leido el correo?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            leido = true;
        } else {
            leido = false;
        }

        c = new Correo(cuerpo, leido);

        buzo.add(c);
    }

    public boolean porLeer(ArrayList<Correo> correos) {

        for (int i = 0; i < correos.size(); i++) {

            todosLeidos = true;
            if (correos.get(i).isLeido() == false) {

                todosLeidos = false;
            }
        }
        return todosLeidos;

    }

    public String muestraPrimerNoLeido(ArrayList<Correo> buzon) {
        
        for (int i = 0; i < buzon.size(); i++) {
            
            if (buzon.get(i).isLeido() == false){  
                primerNoLeido = buzon.get(i).getContenido();     
            }    
        }
        return primerNoLeido;
    }

    public String muestra(int k, ArrayList<Correo> buz) {

        k = k - 1;

        for (int i = 0; i < buz.size(); i++) {       
            if (k == i){      
                contenido = buz.get(i).getContenido();
            }
        } 
        return contenido;
    }

    public void elimina(ArrayList borrar) {
        int corr = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el correo que quiere borrar"));

        corr = corr - 1;
        for (int i = 0; i < borrar.size(); i++) {
            if (corr == i) {
                borrar.remove(i);
            }
        }
    }
}
