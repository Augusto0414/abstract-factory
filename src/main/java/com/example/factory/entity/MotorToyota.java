package com.example.factory.entity;

public class MotorToyota extends Motor {
    public MotorToyota(String potenciaMaxima, String noPieza, String tecnologia) {
        super(potenciaMaxima, noPieza, tecnologia);
    }

    @Override
    public String toString() {
        return "Toyota Motor [Potencia Maxima=" + potenciaMaxima + ", No Pieza=" + noPieza + ", Tecnología=" + tecnologia + "]";
    }
}
