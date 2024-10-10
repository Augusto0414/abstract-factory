package com.example.factory.entity;

public class ChasisMazda extends Chasis {
    public ChasisMazda(String noEjes, String noPieza, String tipoTransmision) {
        super(noEjes, noPieza, tipoTransmision);
    }

    @Override
    public String toString() {
        return "Toyota Chasis [No Ejes=" + noEjes + ", No Pieza=" + noPieza + ", Transmisión=" + tipoTransmision + "]";
    }
}
