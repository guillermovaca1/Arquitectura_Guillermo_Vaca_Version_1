package com.example.arquitectura_guillermo_vaca;

public class Triangulo extends Figura{
    private float base;
    private float altura;
    private float ladot;

    public Triangulo(float base, float altura, float ladot) {
        this.base = base;
        this.altura = altura;
        this.ladot = ladot;
    }

    @Override
    public double CalcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double CalcularPerimetro() {
        return ladot+ladot+ladot;
    }
}
