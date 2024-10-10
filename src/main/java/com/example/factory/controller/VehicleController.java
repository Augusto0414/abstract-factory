package com.example.factory.controller;

import com.example.factory.dto.VehiculoDTO;
import com.example.factory.entity.Vehiculo;
import com.example.factory.service.EnsamblajeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vehiculos")
public class VehicleController {

    private final EnsamblajeService ensamblajeService;

    public VehicleController(EnsamblajeService ensamblajeService) {
        this.ensamblajeService = ensamblajeService;
    }

    @PostMapping(value = "/ensamblar", produces = "application/json")
    public ResponseEntity<Vehiculo> ensamblarVehiculo(@RequestBody VehiculoDTO dto) {

        // Llama al servicio para ensamblar el vehículo usando el DTO proporcionado
        Vehiculo vehiculo = ensamblajeService.ensamblarVehiculo(dto);

        // Devuelve la respuesta con el vehículo ensamblado
        return ResponseEntity.ok(vehiculo);
    }

}
