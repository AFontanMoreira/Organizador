package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Boton extends JFrame implements ActionListener {
    JButton boton;
    JLabel texto;

    public Boton(){

        setLayout(null);
        boton = new JButton("Salir");
        boton.setBounds(100,150,100,30);
        boton.addActionListener(this);
        add(boton);
        texto=new JLabel("Presione el boton para salir");
        texto.setBounds(50,50,220,40);
        add(texto);


    }
    public void crearBoton(ArrayList<String> direct){
        Boton crear = new Boton();
        for (int i=0;i<direct.toArray().length;i++){



        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton){
            setTitle("Saldra en 3 segundos");
            try {
                Thread.sleep(3000);
                System.exit(0);
            }catch (Exception exception){
                System.exit(0);
            }
        }
    }
}
