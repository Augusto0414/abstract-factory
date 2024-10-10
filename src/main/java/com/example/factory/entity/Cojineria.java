package com.example.factory.entity;

public abstract class Cojineria {
    protected String noPieza;
    protected String material;

    public Cojineria(String noPieza, String material) {
        this.noPieza = noPieza;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    @Override
    public abstract String toString();
}
