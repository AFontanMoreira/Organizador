package com.company;

import java.io.File;
import java.util.ArrayList;

public class Asignacion {
    public static void lectura(String direct) {
        File folder = new File(direct);
        File[] carpeta = folder.listFiles();
        ArrayList<File> directorios = new ArrayList<>();
        ArrayList<File> fotos = new ArrayList<>();
        for (int i = 0; i < carpeta.length; i++) {
            if (carpeta[i].isDirectory()) {
                directorios.add(carpeta[i]);
                System.out.println("Directorio " + carpeta[i].getName());
            } else
                fotos.add(carpeta[i]);
                System.out.println("Fotos " + carpeta[i].getName());
        }
    }
    public static void asignar(){

    }

}