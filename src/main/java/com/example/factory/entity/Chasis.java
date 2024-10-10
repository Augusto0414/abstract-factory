package com.example.factory.entity;

public abstract class Chasis {
    protected String noEjes;
    protected String noPieza;
    protected String tipoTransmision;

    public Chasis(String noEjes, String noPieza, String tipoTransmision) {
        this.noEjes = noEjes;
        this.noPieza = noPieza;
        this.tipoTransmision = tipoTransmision;
    }

    public String getNoEjes() {
        return noEjes;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setNoEjes(String noEjes) {
        this.noEjes = noEjes;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public abstract String toString();
}
