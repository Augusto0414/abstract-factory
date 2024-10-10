package com.example.factory.dto;

public class VehiculoDTO {
    private String chasisNoEjes;
    private String chasisNoPieza;
    private String chasisTipoTransmision;
    private String cojineriaMaterial;
    private String cojineriaNoPieza;
    private String color;
    private String marca;
    private String motorNoPieza;
    private String motorPotenciaMaxima;
    private String motorTecnologia;
    private String numeroEnsamblaje;

    public VehiculoDTO() {}

    public VehiculoDTO(String chasisNoEjes, String chasisNoPieza, String chasisTipoTransmision, String cojineriaMaterial,
                       String cojineriaNoPieza, String color, String marca, String motorNoPieza, String motorPotenciaMaxima,
                       String motorTecnologia, String numeroEnsamblaje) {
        this.chasisNoEjes = chasisNoEjes;
        this.chasisNoPieza = chasisNoPieza;
        this.chasisTipoTransmision = chasisTipoTransmision;
        this.cojineriaMaterial = cojineriaMaterial;
        this.cojineriaNoPieza = cojineriaNoPieza;
        this.color = color;
        this.marca = marca;
        this.motorNoPieza = motorNoPieza;
        this.motorPotenciaMaxima = motorPotenciaMaxima;
        this.motorTecnologia = motorTecnologia;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public String getChasisNoEjes() {
        return chasisNoEjes;
    }

    public void setChasisNoEjes(String chasisNoEjes) {
        this.chasisNoEjes = chasisNoEjes;
    }

    public String getChasisNoPieza() {
        return chasisNoPieza;
    }

    public void setChasisNoPieza(String chasisNoPieza) {
        this.chasisNoPieza = chasisNoPieza;
    }

    public String getChasisTipoTransmision() {
        return chasisTipoTransmision;
    }

    public void setChasisTipoTransmision(String chasisTipoTransmision) {
        this.chasisTipoTransmision = chasisTipoTransmision;
    }

    public String getCojineriaMaterial() {
        return cojineriaMaterial;
    }

    public void setCojineriaMaterial(String cojineriaMaterial) {
        this.cojineriaMaterial = cojineriaMaterial;
    }

    public String getCojineriaNoPieza() {
        return cojineriaNoPieza;
    }

    public void setCojineriaNoPieza(String cojineriaNoPieza) {
        this.cojineriaNoPieza = cojineriaNoPieza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotorNoPieza() {
        return motorNoPieza;
    }

    public void setMotorNoPieza(String motorNoPieza) {
        this.motorNoPieza = motorNoPieza;
    }

    public String getMotorPotenciaMaxima() {
        return motorPotenciaMaxima;
    }

    public void setMotorPotenciaMaxima(String motorPotenciaMaxima) {
        this.motorPotenciaMaxima = motorPotenciaMaxima;
    }

    public String getMotorTecnologia() {
        return motorTecnologia;
    }

    public void setMotorTecnologia(String motorTecnologia) {
        this.motorTecnologia = motorTecnologia;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }
}
