/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbiblioteca;

/**
 *
 * @author Lalo Guzmán
 */
public class Autor {
    private String nombreAutor;

    public Autor(String nombreAutor) {
        setNombreAutor(nombreAutor);
    }

    /**
     * @return the nombreAutor
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * @param nombreAutor the nombreAutor to set
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    private void msjError(String msj) {
        throw new IllegalArgumentException(msj);
    }
    
    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Nombre de Autor: " + getNombreAutor() + "\n" ;     
        return texto;
    }
}
