package com.example.factory.entity;

public class CojineriaMazda extends Cojineria {
    public CojineriaMazda(String noPieza, String material) {
        super(noPieza, material);
    }

    @Override
    public String toString() {
        return "Toyota Cojineria [No Pieza=" + noPieza + ", Material=" + material + "]";
    }
}
