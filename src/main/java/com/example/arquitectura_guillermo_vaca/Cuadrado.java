package com.example.arquitectura_guillermo_vaca;

public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return lado * lado;
    }

    @Override
    public double CalcularPerimetro() {
        return lado * 4;
    }
}
