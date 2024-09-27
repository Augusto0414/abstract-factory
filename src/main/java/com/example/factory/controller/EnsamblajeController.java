package com.example.factory.controller;

import com.example.factory.entity.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.factory.service.EnsamblajeService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class EnsamblajeController {

    @Autowired
    private EnsamblajeService ensamblajeService;

    @GetMapping("/crear")
    public String crearVehiculo(@RequestParam String marca,
                                @RequestParam String color,
                                @RequestParam String numeroEnsamblaje) {
        Vehiculo vehiculo = ensamblajeService.ensamblarVehiculo(marca, color, new Date(), numeroEnsamblaje);
        System.out.println("Vehículo ensamblado: " + vehiculo.toString());
        return vehiculo.toString();
    }

    @GetMapping("/listar")
    public List<Vehiculo> listarVehiculos() {
        return ensamblajeService.obtenerTodosLosVehiculos();
    }
}
