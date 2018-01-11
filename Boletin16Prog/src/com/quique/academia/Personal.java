/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.academia;

/**
 *
 * @author quique
 */
public class Personal {
    
    private String telefono;
    private String correo;

    public Personal() {
    }

    public Personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    @Override
    public String toString() {
        return "Telefono: " + telefono + "\nCorreo: " + correo;
    }
    
    
}
