package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Desktop implements Equipo {

    List<Equipo> desktopList = new ArrayList<>();
    private String fabricante;
    private String modelo;
    private String microprocesador;
    private String memoria;
    private String tarjetaGrafica;

    public Desktop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String getFabricante() {
        return "Alienware";
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getMicroprocesador() {
        return null;
    }

    @Override
    public String getMemoria() {
        return null;
    }

    @Override
    public String getTarjetaGrafica() {
        return null;
    }

}
