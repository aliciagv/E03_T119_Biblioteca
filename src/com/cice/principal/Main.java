/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.business.IPrestable;
import com.cice.dto.ComicsDTO;
import com.cice.dto.EntidadBaseDTO;
import com.cice.dto.LibroDTO;
import com.cice.dto.RevistaDTO;
import com.cice.utils.Periodicidad;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<EntidadBaseDTO> listaEntidades;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) {
        // TODO code application logic here

        incluirDatos();

        menu();

    }

    private static void incluirDatos() {
        listaEntidades = new ArrayList();

      
        String dateInString = "31-08-1982";
        Date date = null;
        try {
            date = sdf.parse(dateInString);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       /* LibroDTO libro1 = new LibroDTO("Edicion1", "ISBN123", "Autor", date, "Nombre1");
        libro1.setPrestado(true);
        listaEntidades.add(libro1);*/
        listaEntidades.add(new LibroDTO("Edicion1", "ISBN123", "Autor", getRandomJoinDate(), "Nombre1"));
        listaEntidades.add(new LibroDTO("Edicion2", "ISBN124", "Autor", getRandomJoinDate(), "Nombre2"));
        listaEntidades.add(new RevistaDTO("2244", Periodicidad.SEMANAL, getRandomJoinDate(), "Hola1"));
        listaEntidades.add(new LibroDTO("Edicion3", "ISBN125", "Autor", getRandomJoinDate(), "Nombre3"));
        listaEntidades.add(new LibroDTO("Edicion4", "ISBN126", "Autor", getRandomJoinDate(), "Nombre4"));
        listaEntidades.add(new RevistaDTO("2245", Periodicidad.MENSUAL, getRandomJoinDate(), "Hola2"));
        listaEntidades.add(new ComicsDTO("Edicion7", "1254", getRandomJoinDate(), "Comics2"));
        listaEntidades.add(new LibroDTO("Edicion5", "ISBN127", "Autor", getRandomJoinDate(), "Nombre5"));
        listaEntidades.add(new LibroDTO("Edicion6", "ISBN128", "Autor", getRandomJoinDate(), "Nombre6"));
        listaEntidades.add(new ComicsDTO("Edicion6", "1254", getRandomJoinDate(), "Comics1"));

    }

    private static void menu() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==================");
            System.out.println("MENU BIBLIOTECA");
            System.out.println("==================");
            System.out.println("1. Mostrar todos los prestados");
            System.out.println("2.Publicaciones anteriores a una fecha");
            System.out.println("3. Imprimir el listado de publicaciones");
            System.out.println("4. Imprimir el listado de publicaciones diferenciado por prestado o no");
            System.out.println("0. Salir");
            System.out.print("Elige un opción: ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("Adios");
                        break;

                    case 1:
                        mostrarPrestados();
                        break;
                    case 2:
                        buscarPublicacionPorFecha();
                        break;
                    case 3:
                        listarPublicaciones();
                        break;
                    case 4:
                        listarConOpcionPrestado();
                        break;

                    default:
                        System.out.println("La opcion elegida es incorrecta");

                }

            } else {
                System.out.println("ERROR: Debe introducir un número");
                sc.next();
            }
        } while (opcion != 0);

    }

    private static void mostrarPrestados() {

        boolean hayPrestados = false;
        for (EntidadBaseDTO ebdto : listaEntidades) {

            if (ebdto instanceof IPrestable) {
                if (((IPrestable) ebdto).isPrestado()) {
                    hayPrestados = true;
                    ebdto.mostrarInfo();
                }

            }

        }
        if (!hayPrestados) {
            System.out.println("No hay ningún libro prestado");
        }

    }

    private static void buscarPublicacionPorFecha() {

    }

    private static void listarPublicaciones() {
        for (EntidadBaseDTO ebdto : listaEntidades) {
            ebdto.mostrarInfo();

        }

    }

    private static void listarConOpcionPrestado() {

        for (EntidadBaseDTO ebdto : listaEntidades) {

            ebdto.mostrarInfo();
            if (ebdto instanceof IPrestable) {
                if (((IPrestable) ebdto).isPrestado()) {
                    System.out.println("Prestado:  SI");
                } else {
                    System.out.println("Prestado: NO");
                }
            }

        }

    }
    
    
private static Date getRandomJoinDate()
    {
        String sdate="";
        int yearBegin=1990;
        int yearEnd=2016-yearBegin;
        sdate=""+(1 + (int)(Math.random() * 31)+"-"+(1 + (int)(Math.random() * 12)+"-"+(yearBegin + (int)(Math.random() * yearEnd))));
        Date date=null;
        try {
            date = sdf.parse(sdate);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

}
