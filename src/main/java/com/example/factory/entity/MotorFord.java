package com.example.factory.entity;

public class MotorFord extends Motor {
    public MotorFord(String potenciaMaxima, String noPieza, String tecnologia) {
        super(potenciaMaxima, noPieza, tecnologia);
    }

    @Override
    public String toString() {
        return "Toyota Motor [Potencia Maxima=" + potenciaMaxima + ", No Pieza=" + noPieza + ", Tecnología=" + tecnologia + "]";
    }
}
