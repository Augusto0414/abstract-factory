# Proyecto de Ensamblaje de Vehículos

Este proyecto permite ensamblar vehículos utilizando especificaciones detalladas. A continuación se presentan las características del vehículo que se ensamblará.

## Especificaciones del Vehículo

- **Marca:** Ford
- **Color:** Rojo
- **Número de Ensamblaje:** 12345
- **Chasis:**
  - **Número de Ejes:** 4
  - **Número de Pieza:** CH123
  - **Tipo de Transmisión:** Automática
- **Motor:**
  - **Potencia Máxima:** 300 HP
  - **Número de Pieza:** MO567
  - **Tecnología:** Híbrido
- **Cojinería:**
  - **Número de Pieza:** CO987
  - **Material:** Cuero

## Estructura del Vehículo

Cada vehículo tiene la siguiente estructura:

```json
{
  "marca": "ford",
  "color": "rojo",
  "numeroEnsamblaje": "12345",
  "chasisNoEjes": 4,
  "chasisNoPieza": "CH123",
  "chasisTipoTransmision": "automatica",
  "motorPotenciaMaxima": 300,
  "motorNoPieza": "MO567",
  "motorTecnologia": "hibrido",
  "cojineriaNoPieza": "CO987",
  "cojineriaMaterial": "cuero"
}
```

## Endpoints

### 1. Ensamblar un Vehículo

Para ensamblar un nuevo vehículo, utiliza el siguiente endpoint:

```
POST http://localhost:8080/vehiculos/ensamblar
```

**Ejemplo de solicitud:**

```json
{
  "marca": "ford",
  "color": "rojo",
  "numeroEnsamblaje": "12345",
  "chasisNoEjes": 4,
  "chasisNoPieza": "CH123",
  "chasisTipoTransmision": "automatica",
  "motorPotenciaMaxima": 300,
  "motorNoPieza": "MO567",
  "motorTecnologia": "hibrido",
  "cojineriaNoPieza": "CO987",
  "cojineriaMaterial": "cuero"
}
```

Este endpoint permite crear un nuevo vehículo ensamblando los componentes proporcionados.
