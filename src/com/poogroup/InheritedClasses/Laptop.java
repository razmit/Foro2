package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Equipo {

List<Equipo> laptopList = new ArrayList<>();
    @Override
    public String getFabricante() {
        return null;
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
