package com.example.factory.entity;

public class CojineriaFord extends Cojineria {
    public CojineriaFord(String noPieza, String material) {
        super(noPieza, material);
    }

    @Override
    public String toString() {
        return "Toyota Cojineria [No Pieza=" + noPieza + ", Material=" + material + "]";
    }
}
