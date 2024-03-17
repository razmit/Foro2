package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Laptop implements Equipo {

List<Equipo> laptopList = new ArrayList<>();
private String fabricante;
private String modelo;
private String microprocesador;
private String memoria;
private String pantalla;
private String discoduro;
private String tarjetaGrafica;


public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String pantalla, String discoduro, String tarjetaGrafica){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.microprocesador = microprocesador;
    this.memoria = memoria;
    this.discoduro = discoduro;
    this.pantalla = pantalla;
    this.tarjetaGrafica = tarjetaGrafica;
}

    @Override
    public String getFabricante() {
        return "fabricante";
    }

    @Override
    public String getModelo() {
        return "modelo";
    }

    @Override
    public String getMicroprocesador() {
        return "microprocesador";
    }

    @Override
    public String getMemoria() {
        return "memoria";
    }

    @Override
    public String getTarjetaGrafica() {
        return null;
    }

    public String getPantalla() {
        return "pantalla";
    }

    public String getDiscoDuro() {
        return "discoduro";
    }
}
