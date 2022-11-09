/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbiblioteca;

import java.util.GregorianCalendar;

/**
 *
 * @author Lalo Guzmán
 */
public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private GregorianCalendar fechaPrestamo;
    private int diasPrestamo;
    private Devolucion devolucion;

    public Prestamo(Usuario usuario, Libro libro, GregorianCalendar fechaPrestamo, int diasPrestamo) {
        setUsuario(usuario);
        setLibro(libro);
        setFechaPrestamo(fechaPrestamo);
        setDiasPrestamo(diasPrestamo);
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the fechaPrestamo
     */
    public GregorianCalendar getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(GregorianCalendar fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return the diasPrestamo
     */
    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    /**
     * @param diasPrestamo the diasPrestamo to set
     */
    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    /**
     * @return the devolucion
     */
    public Devolucion getDevolucion() {
        return devolucion;
    }

    /**
     * @param devolucion the devolucion to set
     */
    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }
    
    private void msjError(String msj) {
        throw new IllegalArgumentException(msj);
    }
    
    public String obtenerTipoDeUsuario() {
        if (getUsuario() instanceof Docente) {
            return "Docente";
        }
       
        return "Estudiante";
    }
    
    @Override
    public String toString() {
        // GENERAMOS UN ESTADO BASE
        String texto = "Prestamo: \n" + 
                "ISBN: " + getLibro().getIsbn() + "\n" +
                "RUN: " + getUsuario().getRun() + "\n" +
                "Arrendado por: " + obtenerTipoDeUsuario() + "\n" + 
                "Estado: ";
        
        // LO MODIFICAMOS EN BASE A LA DEVOLUCIÓN
        if (getDevolucion() == null) {
            texto += "En préstamo.";
        } else {
            texto += "Devuelto.";
        }
        return texto;
    }
}
