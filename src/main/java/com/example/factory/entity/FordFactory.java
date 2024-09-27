package com.example.factory.entity;


import org.springframework.stereotype.Component;

@Component
public class FordFactory implements IAbstracFactory {

    @Override
    public IChasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorFord();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaFord();
    }
}
