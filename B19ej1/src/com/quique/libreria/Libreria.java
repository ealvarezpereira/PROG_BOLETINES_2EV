/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.libreria;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Libreria {

//     engadir libros
//     vender ( borrar ) libros
//     amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
//     dar de baixa os libros con numero de unidades =0
//     consultar un libro determinado
//     Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null. 
//     No caso contrario lanza una excepción.
    public void añadirLibros(Object objLibro, ArrayList libros) {

        String titulo = JOptionPane.showInputDialog("Titulo del libro");
        String autor = JOptionPane.showInputDialog("Autor del libro");
        String isbn = JOptionPane.showInputDialog("ISBN");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del libro"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));

        objLibro = new Libro(titulo, autor, isbn, precio, cantidad);

        libros.add(objLibro);

    }

    public void venderLibro(Libro objLibro, ArrayList<Libro> arrayParaVender) {

        try {
            String isbn = JOptionPane.showInputDialog("Introduzca el libro que quiere vender");
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de libros que va a vender"));
            for (int i = 0; i < arrayParaVender.size(); i++) {

                if (cant > arrayParaVender.get(i).getCantidad()) {
                    System.out.println("No hay libros suficientes.");
                } else {

                    if (arrayParaVender.get(i).getCantidad() > 0) {

                        if (isbn.equals(arrayParaVender.get(i).getIsbn())) {

                            int cc = arrayParaVender.get(i).getCantidad() - cant;

                            arrayParaVender.get(i).setCantidad(cc);
                        }
                    } else {
                        System.out.println("No quedan cantidades");
                    }
                }
            }

        } catch (NullPointerException e) {
            System.out.println("El array es nulo");
        }
    }

    public void mostrarLibros(ArrayList<Libro> arrayParaMostrar) {
        
        try {
            
            Collections.sort(arrayParaMostrar);
            System.out.println(arrayParaMostrar);
            
        } catch (NullPointerException e) {
            System.out.println("El array es nulo");
        }

    }

    public void consultarLibro(ArrayList<Libro> arrayMostrarLibros) {

        try {

            String titulo = JOptionPane.showInputDialog("Introduce el libro que quieres consultar");
            for (int i = 0; i < arrayMostrarLibros.size(); i++) {
                if (titulo.equals(arrayMostrarLibros.get(i).getTitulo())) {

                    System.out.println(arrayMostrarLibros.get(i));
                }
            }

        } catch (NullPointerException e) {
            System.out.println("El array es nulo");
        }
    }

    public void darDeBaja(ArrayList<Libro> darDeBaja) {

        try {

            for (int i = 0; i < darDeBaja.size(); i++) {
                if (darDeBaja.get(i).getCantidad() == 0) {
                    darDeBaja.remove(i);
                    i--;
                }
            }

        } catch (NullPointerException e) {
            System.out.println("El array es nulo");
        }
    }

}
