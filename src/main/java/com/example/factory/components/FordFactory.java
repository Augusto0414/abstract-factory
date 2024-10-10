package com.example.factory.components;


import com.example.factory.dto.VehiculoDTO;
import com.example.factory.entity.*;

public class FordFactory extends AbstracFactory {

    private VehiculoDTO dto;

    public FordFactory(VehiculoDTO dto) {
        this.dto = dto;
    }

    @Override
    public Chasis crearChasis() {
        return new ChasisFord(dto.getChasisNoEjes(), dto.getChasisNoPieza(), dto.getChasisTipoTransmision());
    }

    @Override
    public Motor crearMotor() {
        return new MotorFord(dto.getMotorPotenciaMaxima(), dto.getMotorNoPieza(), dto.getMotorTecnologia());
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaFord(dto.getCojineriaNoPieza(), dto.getCojineriaMaterial());
    }
}
