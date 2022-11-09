/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbiblioteca;

/**
 *
 * @author Lalo Guzmán
 */
public class Usuario {
    private String run;
    private String nombre;
    private char genero;
    private String prestamo;

    public Usuario(String run, String nombre, char genero) {
        setRun(run);
        setNombre(nombre);
        setGenero(genero);
        setPrestamo("0");
    }

    /**
     * @return the run
     */
    public String getRun() {
        return run;
    }

    /**
     * @param rut the run to set
     */
    public void setRun(String rut) {
        this.run = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the prestamo
     */
    public String getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }
    
    private void msjError(String msj) {
        throw new IllegalArgumentException(msj);
    }   
    
    @Override
    public String toString() {
        String texto = "RUN       : " + getRun() + "\n" +
               "NOMBRE    : " + getNombre() + "\n" +
               "GENERO    : " + getGenero() + "\n" +
               "PRESTAMO  : ";
        
           if (getPrestamo() == "0") {
               texto += "Sin préstamo vigente \n";
           }else{
               texto += "Con prestamovigente (" + getPrestamo() + ")";
           }
        return texto;
    }
}
