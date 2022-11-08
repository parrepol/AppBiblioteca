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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PantallaSecundaria extends JDialog implements ActionListener{
    /* Declaro variables */
    private JButton boton2;
    private JLabel label1;
    
    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */
    public PantallaSecundaria(Pantalla parent, boolean modal) {

        /* Invoco al constructor de la clase superior */
        super(parent, modal);

        /* Layout absoluto y límites*/
//        setLayout(null);
//        setBounds(440,10,410,210);

        //Etiqueta
        label1 = new JLabel("Esta es la ventana secundaria");
        label1.setBounds(115,60,200,30);
        add(label1);

        //Botón
        boton2 = new JButton("Volver");
        boton2.setBounds(105,110,200,40);
        add(boton2);

        /* Inicializo escuchador del botón */
        boton2.addActionListener(this);
        
        //Configurar y mostrar JFrame
        initPantalla();

    }
    
    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("AppBiblioteca: Devolución de Préstamo"); //Título del JFrame
        //size de pantalla a la  mitad de la resolucion actual.
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/2, height/2);
        setResizable(false); //No redimensionable
        setLocationRelativeTo(null);
    }
    
    /* Método que implementa la acción del botón */
        public void actionPerformed(ActionEvent e) {
          if (e.getSource() == boton2) {
            //Cierro la pantalla
            setVisible(false);
          }
    }
}


