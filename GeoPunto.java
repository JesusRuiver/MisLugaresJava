package com.example.mislugares;

/**
 * Created by Jesús Manuel Ruiz Verdejo on 04/10/2017.
 */

public class GeoPunto {

    private double longitud,latitud;

    public GeoPunto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
