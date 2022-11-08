/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbiblioteca;

/**
 *
 * @author Lalo Guzmán
 */

/* Importo las clases necesarias */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pantalla extends JFrame implements ActionListener{
    /* Declaro variables */
    private JButton boton1;
    private JLabel label1;
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, menu4, menu5;
    private JMenuItem menuItem21, menuItem22, menuItem31, menuItem32, menuItem41, menuItem42, menuItem43, menuItem51, menuItem52, menuItem6, menuItem7, menuS;

    /* Constructor */
    public Pantalla() {
        // Objetos de Menu
        /* Creamos el JMenuBar y lo asociamos con el JFrame */
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        menu1=new JMenu("Menú");
        menuBar.add(menu1);

        /* Creamos el segundo y tercer objetos de la clase JMenu y los asociamos con el primer JMenu creado */
        menu2=new JMenu("Tamaño de la ventana");
        menu1.add(menu2);
        menu3=new JMenu("Color de fondo");
        menu1.add(menu3);
        menu4=new JMenu("Usuarios");
        menu1.add(menu4);
        menu5=new JMenu("Libros");
        menu1.add(menu5);

        menuS = new JMenuItem("Salir");
        menuBar.add(menuS);
        menuS.addActionListener(this);
        
        /* Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el segundo JMenu */
        menuItem21=new JMenuItem("640*480");
        menu2.add(menuItem21);
        menuItem21.addActionListener(this);
        menuItem22=new JMenuItem("1024*768");
        menu2.add(menuItem22);
        menuItem22.addActionListener(this);

        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el tercer JMenu */
        menuItem31=new JMenuItem("Rojo");
        menu3.add(menuItem31);
        menuItem31.addActionListener(this);
        menuItem32=new JMenuItem("Verde");
        menu3.add(menuItem32);
        menuItem32.addActionListener(this);
        
        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el cuarto JMenu */
        menuItem41=new JMenuItem("Nuevo Usuario");
        menu4.add(menuItem41);
        menuItem41.addActionListener(this);
        menuItem42=new JMenuItem("Modificar Usuario");
        menu4.add(menuItem42);
        menuItem42.addActionListener(this);
        menuItem43=new JMenuItem("Eliminar Usuario");
        menu4.add(menuItem43);
        menuItem43.addActionListener(this);
        
        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el quinto JMenu */
        menuItem51=new JMenuItem("Nuevo Libro");
        menu5.add(menuItem51);
        menuItem51.addActionListener(this);
        menuItem52=new JMenuItem("Eliminar Libro");
        menu5.add(menuItem52);
        menuItem52.addActionListener(this);
        
        menuItem6=new JMenuItem("Prestar");
        menu1.add(menuItem6);
        menuItem6.addActionListener(this);
        
        menuItem7=new JMenuItem("Devolver");
        menu1.add(menuItem7);
        menuItem7.addActionListener(this);
        
        
        //Otros Objetos de Pantalla
        //Etiqueta
        label1 = new JLabel("Grupo 15");
        label1.setBounds(115,60,200,30);
        add(label1);

        /*Botón
        boton1 = new JButton("Haz clic aquí");
        boton1.setBounds(105,110,200,40);
        add(boton1); */
        
        /* Inicializo escuchador del botón 
        boton1.addActionListener(this);*/
        

        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("AppBiblioteca: Grupo 15"); //Título del JFrame
        //size de pantalla a la  mitad de la resolucion actual.
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/2, height/2);
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setLocationRelativeTo(null);
        setVisible(true); //Mostrar JFrame
    }
    
    /* Método que implementa las acciones de cada ítem de menú */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==menuItem21) {
            setSize(640,480);
        }
        if (e.getSource()==menuItem22) {
            setSize(1024,768);
        }
        if (e.getSource()==menuItem31) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==menuItem32) {
            getContentPane().setBackground(new Color(0,255,0));
        }
        if (e.getSource() == menuItem7) {
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
            PantallaSecundaria secundaria = new PantallaSecundaria(this,true);
            secundaria.setVisible(true);
        }
        if (e.getSource()==menuS) {
            this.dispose();;
        }
    }
    
}
