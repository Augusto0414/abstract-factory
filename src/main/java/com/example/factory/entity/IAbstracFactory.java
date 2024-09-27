package com.example.factory.entity;

public interface IAbstracFactory {
    IChasis crearChasis();
    IMotor crearMotor();
    ICojineria crearCojineria();
}
