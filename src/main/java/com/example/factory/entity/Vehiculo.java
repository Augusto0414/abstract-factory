package com.example.factory.entity;

import java.util.Date;

public class Vehiculo {
    private IChasis chasis;
    private IMotor motor;
    private ICojineria cojineria;
    private String color;
    private Date fechaEnsamblaje;
    private String numeroEnsamblaje;

    public Vehiculo(IChasis chasis, IMotor motor, ICojineria cojineria, String color, Date fechaEnsamblaje, String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "chasis=" + chasis.getNumeroPieza() +
                ", motor=" + motor.getNumeroPieza() +
                ", cojineria=" + cojineria.getNumeroPieza() +
                ", material="+cojineria.getMaterial() +
                ", color='" + color + '\'' +
                ", fechaEnsamblaje=" + fechaEnsamblaje +
                ", numeroEnsamblaje='" + numeroEnsamblaje + '\'' +
                '}';
    }
}
