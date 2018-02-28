/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.libreria;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Libreria {

    /**
     * @param fich Objeto tipo file que es el fichero
     * @param escribir Objeto de tipo PrintWriter
     * @param lib Objeto de tipo libro
     *
     */
    private File fich, fich2;
    private PrintWriter escribir;
    private Libro lib;
    private String line = "";
    private String totalline = "";
    private static int m = 0;

    /**
     * Metodo para insertar un libro en el fichero
     */
    public void insertarLibro() {
        /**
         * Estos JOptionPane son para darle valores al constructor de Libro
         *
         * @param tit Titulo del libro
         * @param aut Autor del libro
         * @param prec Precio del libro
         * @param uds Unidades de libros
         */
        String tit = JOptionPane.showInputDialog("Titulo del libro");
        String aut = JOptionPane.showInputDialog("Autor del libro");
        float prec = Float.parseFloat(JOptionPane.showInputDialog("Precio del libro"));
        int uds = Integer.parseInt(JOptionPane.showInputDialog("Unidades de libros"));

        try {
            /**
             * Fich pasa a ser un nuevo archivo file
             *
             * @param escribir pasa a ser un nuevo PrintWriter que tiene dentro
             * un FileWriter con el fichero.
             *
             * Introducimos el objeto de tipo libro en el fichero.
             */
            fich = new File("libreria.txt");
            escribir = new PrintWriter(new FileWriter(fich, true));
            escribir.println(lib = new Libro(tit, aut, prec, uds));

        } catch (FileNotFoundException ex) {
            /**
             * Excepcion mas estricta Excepcion general
             *
             * @param ex Excepcion de tipo FileNotFoundException
             * @param ex (Segundo ex) Excepcion de tipo IOException
             */
            System.out.println("Error de escritura" + ex);

        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex);
        } finally {
            escribir.close();
        }

    }

    /**
     * Metodo para consultar el precio de un libro segun el titulo que le metes
     */
    public void consultarLibro() {

        fich = new File("libreria.txt");

        try {

            //Aqui pedimos el titulo del libro
            String pedir = JOptionPane.showInputDialog("Introduce el titulo");

            //Creamos un buffer del fichero para leer datos
            final BufferedReader reader = new BufferedReader(new FileReader("libreria.txt"));

            //Mietras que la linea que le metes el valor reader.readLine() (que lo que hace es
            //leer la linea) sea distinto de null te haga el if
            while ((line = reader.readLine()) != null) {
                m = 0;

                //El indexOf si no encuentra el valor que le metes devuelve un -1, por eso la comparacion
                //Si la busqueda es distinto de -1
                if (line.indexOf(pedir) != -1) {

                    //Dentro de un array metemos la fila que tenemos en line y lo dividimos por comas
                    //Y se muestra la posicion en la que está el precio
                    //La marca m es para que si encuentra un libro salte la marca
                    m = 1;
                    String[] lista = line.split("\\s*,\\s*");
                    JOptionPane.showMessageDialog(null, lista[2]);

                    break;
                }
            }

            //Si no ha entrado en el if es que no existe el libro
            if (m == 0) {
                JOptionPane.showMessageDialog(null, "Ese libro no existe.");

            }

            reader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

    public void visualizarLibros() {

        fich = new File("libreria.txt");

        try {

            //Abrimos el fichero en modo lectura
            final BufferedReader reader = new BufferedReader(new FileReader("libreria.txt"));

            //Mientras haya linea que a la variable totalline le añada su valor mas una linea
            while ((line = reader.readLine()) != null) {
                totalline = totalline + "\n" + line;
            }

            JOptionPane.showMessageDialog(null, totalline);

            reader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        } finally {
            totalline = "";
        }
    }

    public void borrarLibro() {

        //Creamos dos ficheros
        fich = new File("libreria.txt");
        fich2 = new File("libreria2.txt");

        try {

            //Abrimos un Buffer de lectura
            final BufferedReader reader = new BufferedReader(new FileReader("libreria.txt"));
            //Abrimos un PrintWriter del fichero 2
            escribir = new PrintWriter(new FileWriter(fich2, true));
            //Mientras que haya una linea que leer a la variable salvadas le introducimos la linea que queremos guardar
            while ((line = reader.readLine()) != null) {
                String salvadas = line;

                //Si l a linea salvada no contiene "Unidades: 0" escribimos esa linea en el nuevo fichero
                if (salvadas.contains("Unidades: 0") != true) {
                    escribir.println(salvadas);
                }
            }

            reader.close();
            escribir.close();
            fich.delete();
            //Renombramos el fichero
            boolean correcto = fich2.renameTo(fich);

            if (correcto) {
                System.out.println("Fichero renombrado.");

            } else {
                System.out.println("fichero no renombrado");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

    public void modificarLibro() {

        fich = new File("libreria.txt");
        fich2 = new File("libreria2.txt");
        
        try {

            //Aqui pedimos el titulo del libro
            String pedir = JOptionPane.showInputDialog("Introduce el titulo");

            float nprecio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo precio"));
            
            //Creamos un buffer del fichero para leer datos
            final BufferedReader reader = new BufferedReader(new FileReader("libreria.txt"));

            escribir = new PrintWriter(new FileWriter(fich2, true));
            //Mietras que la linea que le metes el valor reader.readLine() (que lo que hace es
            //leer la linea) sea distinto de null te haga el if
            while ((line = reader.readLine()) != null) {
                m = 0;
                String salvadas = line;

                if (salvadas.contains(pedir) != true) {
                    escribir.println(salvadas);
                }else{
                
                    //Separamos la linea por comas
                    String[] sep = salvadas.split("\\s*,\\s*");
                    
                    //Añadimos el precio a un string
                    String precio = sep[2];
                    
                    //Separamos la palabra precio del precio en si
                    String[] precioseparado = precio.split("\\s*:\\s*");
                    //A la posicion del precio en si le damos el valor del precio que introducimos
                    precioseparado[1] = String.valueOf(nprecio);
                    //A la linea le añadimos la cadena entera
                    salvadas = sep[0]+", "+sep[1]+", "+precioseparado[0]+": "+precioseparado[1]+", "+sep[3];
                    escribir.println(salvadas);
                    salvadas = "";
                    precio ="";
                }
            }

            reader.close();
            escribir.close();
            fich.delete();
            //Renombramos el fichero
            boolean correcto = fich2.renameTo(fich);

            if (correcto) {
                System.out.println("Fichero renombrado.");

            } else {
                System.out.println("fichero no renombrado");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }

    }

}
