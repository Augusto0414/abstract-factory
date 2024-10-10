package com.example.factory.entity;

import java.util.Date;

public class Vehiculo {
    private String color;
    private Date fechaEnsamblaje;
    private String numeroEnsamblaje;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    public Vehiculo(String color, Date fechaEnsamblaje, String numeroEnsamblaje, Chasis chasis, Motor motor, Cojineria cojineria) {
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }

    public String getColor() {
        return color;
    }

    public Date getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }
}
