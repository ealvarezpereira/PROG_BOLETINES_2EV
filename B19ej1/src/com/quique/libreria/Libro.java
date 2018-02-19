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
public class Libro implements Comparable {

    private String titulo;
    private String autor;
    private String isbn;
    private float precio;
    private int cantidad;

    public Libro(String titulo, String autor, String isbn, float precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor:" + autor + ", ISBN: " + isbn + ", Precio: " + precio + ", Cantidad: " + cantidad;
    }

    @Override
    public int compareTo(Object t) {

        Libro lib = (Libro) t;

        if (lib.titulo.compareToIgnoreCase(this.titulo) == 0) {
            return 0;
        } else if (lib.titulo.compareToIgnoreCase(this.titulo) < 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
