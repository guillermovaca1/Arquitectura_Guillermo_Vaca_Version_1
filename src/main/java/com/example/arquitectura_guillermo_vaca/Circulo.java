package com.example.arquitectura_guillermo_vaca;

public class Circulo extends Figura{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {

        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalcularPerimetro() {
        return Math.PI * 2 * radio;
    }
}
