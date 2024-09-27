package com.example.factory.entity;

public class CojineriaFord implements ICojineria {

    @Override
    public String getNumeroPieza() {
        return "T789";
    }

    @Override
    public String getMaterial() {
        return "cuero";
    }
}
