package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String directorio= JOptionPane.showInputDialog(null,"Dime de que directorio quieres organizar las fotos");
        Asignacion.lectura(directorio);
        /*
        Boton ventana = new Boton();
        ventana.setBounds(500,250,300,250);
        ventana.setVisible(true);
        ventana.setResizable(false);

         */

    }
}
