package com.example.controldegastos.ui.main;

public class Efectivo {

    private String Fecha, Descripcion;
    private int MontoEfect,CodEfectivo;

    public Efectivo(int codEfectivo,String fecha, String descripcion, int montoEfect) {
        Fecha = fecha;
        Descripcion = descripcion;
        MontoEfect = montoEfect;
        CodEfectivo = codEfectivo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getMontoEfect() {
        return MontoEfect;
    }

    public void setMontoEfect(int montoEfect) {
        MontoEfect = montoEfect;
    }

    public int getCodEfectivo() {
        return CodEfectivo;
    }

    public void setCodEfectivo(int codEfectivo) {
        CodEfectivo = codEfectivo;
    }
}
