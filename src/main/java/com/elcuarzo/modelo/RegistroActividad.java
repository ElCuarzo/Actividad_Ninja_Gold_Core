package com.elcuarzo.modelo;

import java.util.Date;

public class RegistroActividad {
    private String tipoActividad;
    private int oro;
    private Date fechaHora;

    public RegistroActividad(String tipoActividad, int oro, Date fechaHora) {
        this.tipoActividad = tipoActividad;
        this.oro = oro;
        this.fechaHora = fechaHora;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
