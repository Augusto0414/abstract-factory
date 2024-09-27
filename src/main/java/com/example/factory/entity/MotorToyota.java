package com.example.factory.entity;

public class MotorToyota implements IMotor {
    @Override
    public int getPotenciaMaxima() {
        return 200;
    }

    @Override
    public String getNumeroPieza() {
        return "T456";
    }

    @Override
    public String getTecnologia() {
        return "híbrido";
    }
}
