package com.example.mislugares;

/**
 * Created by Vespertino on 04/10/2017.
 */

public class Principal {

    public static void main(String[] args) {
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía", "C/ Paranimf, 1 46730 Gandia SPAIN)", -0.166093, 38.995656,TipoLugar.EDUCACION,
                962849300, "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse.", 3);


        System.out.print("Lugar: " + lugar.toString());
    }
}
