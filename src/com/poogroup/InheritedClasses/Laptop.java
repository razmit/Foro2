package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Equipo {

List<Equipo> laptopList = new ArrayList<>();
private String fabricante;
private String modelo;
private String microprocesador;
private String memoria;
private String tarjetaGrafica;

public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.microprocesador = microprocesador;
    this.memoria = memoria;
    this.tarjetaGrafica = tarjetaGrafica;
}

    @Override
    public String getFabricante() {
        return "Dell";
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

    @Override
    public void registrarAsset() {

    }

    @Override
    public void mostrarAssets() {

    }
}
