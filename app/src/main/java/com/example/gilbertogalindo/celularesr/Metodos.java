package com.example.gilbertogalindo.celularesr;

import java.util.ArrayList;

/**
 * Created by Gilberto Galindo on 23/10/2017.
 */

public class Metodos {
    public static ArrayList<Celular> ram_Samsung(ArrayList<Celular> celulares){
        ArrayList<Celular> cels = new ArrayList();

        for (int i = 0; i < celulares.size() ; i++) {
            Celular celular = celulares.get(i);

            if (celular.getMarca() == 0 && (celular.getRAM() >= 2 && celular.getRAM() <= 4)) {
                cels.add(celular);
            }
        }

        return cels;
    }


    public static int apples_negros(ArrayList<Celular> celulares){
        int count = 0;

        for (int i = 0; i < celulares.size() ; i++) {
            if (celulares.get(i).getMarca() == 2 && celulares.get(i).getColor() == 0)count++;
        }

        return count;
    }


    public static double promedio_nokias(ArrayList<Celular> celulares){
        double promedio;
        double sum = 0, count = 0;

        if(celulares.isEmpty()){
            promedio = 0;
        }else {
            for (int i = 0; i < celulares.size() ; i++) {
                Celular celular = celulares.get(i);

                if (celular.getMarca() == 1){
                    sum += celular.getPrecio();
                    count++;
                }
            }

            promedio = sum / count;
        }

        return promedio;
    }
}
