package com.example.gilbertogalindo.celularesr;

import java.util.ArrayList;

/**
 * Created by Gilberto Galindo on 23/10/2017.
 */

public class Datos {
    private static ArrayList<Celular> celulares = new ArrayList();

    public static void guardarCelulares(Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> obtenerCelulares(){
        return celulares;
    }
}
