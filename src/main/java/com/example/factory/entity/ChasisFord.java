package com.example.factory.entity;

public class ChasisFord implements IChasis{
    @Override
    public int getNumeroEjes() {
        return 4;
    }

    @Override
    public String getNumeroPieza() {
        return "T123";
    }

    @Override
    public String getTipoTransmision() {
        return "automática";
    }
}
