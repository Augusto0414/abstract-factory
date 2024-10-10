package com.example.factory.service;

import com.example.factory.components.FordFactory;
import com.example.factory.components.MazdaFactory;
import com.example.factory.components.ToyotaFactory;
import com.example.factory.dto.VehiculoDTO;
import com.example.factory.entity.AbstracFactory;
import com.example.factory.entity.Vehiculo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EnsamblajeService {

    public Vehiculo ensamblarVehiculo(VehiculoDTO dto) {
        AbstracFactory factory = switch (dto.getMarca().toLowerCase()) {
            case "toyota" -> new ToyotaFactory(dto);
            case "ford" -> new FordFactory(dto);
            case "mazda" -> new MazdaFactory(dto);
            default -> throw new IllegalArgumentException("Marca no soportada: " + dto.getMarca());
        };


        return new Vehiculo(
                dto.getColor(),
                new Date(),
                dto.getNumeroEnsamblaje(),
                factory.crearChasis(),
                factory.crearMotor(),
                factory.crearCojineria()
        );
    }
}
