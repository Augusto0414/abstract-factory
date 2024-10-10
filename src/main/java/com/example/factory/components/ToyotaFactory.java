package com.example.factory.components;

import com.example.factory.dto.VehiculoDTO;
import com.example.factory.entity.*;

public class ToyotaFactory extends AbstracFactory {
    private VehiculoDTO dto;

    public ToyotaFactory(VehiculoDTO dto) {
        this.dto = dto;
    }

    @Override
    public Chasis crearChasis() {
        return new ChasisToyota(dto.getChasisNoEjes(), dto.getChasisNoPieza(), dto.getChasisTipoTransmision());
    }

    @Override
    public Motor crearMotor() {
        return new MotorToyota(dto.getMotorPotenciaMaxima(), dto.getMotorNoPieza(), dto.getMotorTecnologia());
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaToyota(dto.getCojineriaNoPieza(), dto.getCojineriaMaterial());
    }
}
