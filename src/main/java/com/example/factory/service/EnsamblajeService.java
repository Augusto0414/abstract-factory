package com.example.factory.service;

import com.example.factory.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EnsamblajeService {

    @Autowired
    private ToyotaFactory toyotaFactory;

    @Autowired
    private FordFactory fordFactory;

    @Autowired
    private MazdaFactory mazdaFactory;

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo ensamblarVehiculo(String marca, String color, Date fechaEnsamblaje, String numeroEnsamblaje) {
        IAbstracFactory factory = switch (marca) {
            case "Toyota" -> toyotaFactory;
            case "Ford" -> fordFactory;
            case "Mazda" -> mazdaFactory;
            default -> throw new IllegalArgumentException("Marca no soportada");
        };

        IChasis chasis = factory.crearChasis();
        IMotor motor = factory.crearMotor();
        ICojineria cojineria = factory.crearCojineria();

        Vehiculo vehiculo = new Vehiculo(chasis, motor, cojineria, color, fechaEnsamblaje, numeroEnsamblaje);
        vehiculos.add(vehiculo);
        return vehiculo;
    }

    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return new ArrayList<>(vehiculos);
    }
}
