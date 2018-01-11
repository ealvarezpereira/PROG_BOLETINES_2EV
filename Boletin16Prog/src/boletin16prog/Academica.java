/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16prog;

import calcularnotas.CalcularNotas;
import com.quique.academia.Personal;


/**
 *
 * @author quique
 */
public class Academica {
    
    private static int numReferencia = 2017;
    private String nombre;
    //private double nota; Sobra, ya esta la librería.
    private Personal alum;

    public Academica() {
    }

    public Academica(String nombre, Personal alum) {
        this.nombre = nombre;
        this.numReferencia = numReferencia;
        this.alum = alum;
        numReferencia++;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public double getNota() {
//        return nota;
//    }
//
//    public void setNota(float nota) {
//        this.nota = nota;
//    }

    public Personal getAlum() {
        return alum;
    }

    public void setAlum(Personal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "numReferencia: " + getNumReferencia() + "\nNombre: " + nombre + "\nNota: " + CalcularNotas.getNotaFinal()+ "\nAlum:\n" + alum;
    }
    
    
    
}
