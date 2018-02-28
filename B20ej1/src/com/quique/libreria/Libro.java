/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.libreria;

/**
 *
 * @author quique
 */
public class Libro {
    
    
    private String nombreLibro;
    private String autor;
    private float precio;
    private int unidades;

    public Libro() {
    }

    public Libro(String nombreLibro, String autor, float precio, int unidades) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Titulo: " + nombreLibro + ", Autor: " + autor + ", Precio: " + precio + ", Unidades: " + unidades;
    }
    
    
}
