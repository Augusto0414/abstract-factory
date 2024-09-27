package com.example.factory.entity;

import org.springframework.stereotype.Component;

@Component
public class MazdaFactory implements IAbstracFactory {

    @Override
    public IChasis crearChasis() {
        return new ChasisMazda();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaMazda();
    }
}
