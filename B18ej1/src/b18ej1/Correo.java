/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b18ej1;

/**
 *
 * @author quique
 */
public class Correo {
    
    private String contenido;
    private boolean leido = false;

    public Correo() {
    }

    public Correo(String contenido, boolean leido) {
        this.contenido = contenido;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Contenido: " + contenido + "    Leido: " + leido;
    }   
}
