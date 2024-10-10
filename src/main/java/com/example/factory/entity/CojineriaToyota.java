package com.example.factory.entity;

public class CojineriaToyota extends Cojineria {

    public CojineriaToyota(String noPieza, String material) {
        super(noPieza, material);
    }

    @Override
    public String toString() {
        return "Toyota Cojineria [No Pieza=" + noPieza + ", Material=" + material + "]";
    }
}
