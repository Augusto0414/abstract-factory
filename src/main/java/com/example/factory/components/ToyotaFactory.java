package com.example.factory.entity;

import org.springframework.stereotype.Component;

@Component
public class ToyotaFactory implements IAbstracFactory{

    @Override
    public IChasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorToyota();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaToyota();
    }
}
