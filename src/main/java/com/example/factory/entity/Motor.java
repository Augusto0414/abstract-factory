package com.example.factory.entity;

public abstract class Motor {
    protected String potenciaMaxima;
    protected String noPieza;
    protected String tecnologia;

    public Motor(String potenciaMaxima, String noPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.noPieza = noPieza;
        this.tecnologia = tecnologia;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public String getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public void setPotenciaMaxima(String potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public abstract String toString();
}
