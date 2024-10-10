package com.example.factory.components;

import com.example.factory.dto.VehiculoDTO;
import com.example.factory.entity.*;

public class MazdaFactory extends AbstracFactory {
    private VehiculoDTO dto;


    public MazdaFactory(VehiculoDTO dto) {
        this.dto = dto;
    }

    @Override
    public Chasis crearChasis() {
        return new ChasisMazda(dto.getChasisNoEjes(), dto.getChasisNoPieza(), dto.getChasisTipoTransmision());
    }

    @Override
    public Motor crearMotor() {
        return new MotorMazda(dto.getMotorPotenciaMaxima(), dto.getMotorNoPieza(), dto.getMotorTecnologia());
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaMazda(dto.getCojineriaNoPieza(), dto.getCojineriaMaterial());
    }
}
