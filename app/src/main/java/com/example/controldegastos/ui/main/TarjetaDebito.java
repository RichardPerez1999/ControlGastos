package com.example.controldegastos.ui.main;

public class TarjetaDebito {

    private String Tipo;
    private int Digitos,Cupo,Cuota;

    public TarjetaDebito(String tipo, int digitos, int cupo, int cuota) {
        Tipo = tipo;
        Digitos = digitos;
        Cupo = cupo;
        Cuota = cuota;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getDigitos() {
        return Digitos;
    }

    public void setDigitos(int digitos) {
        Digitos = digitos;
    }

    public int getCupo() {
        return Cupo;
    }

    public void setCupo(int cupo) {
        Cupo = cupo;
    }

    public int getCuota() {
        return Cuota;
    }

    public void setCuota(int cuota) {
        Cuota = cuota;
    }
}
