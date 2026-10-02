package com.example.arquitectura_guillermo_vaca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ArquitecturaGuillermoVacaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArquitecturaGuillermoVacaApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        //Cuadrado
        System.out.println("Cruadrado");
        System.out.println("Ingrese el lado");
        float lado = scanner.nextFloat();

        Cuadrado cuadrado = new Cuadrado(lado);

        System.out.println("Area: " + cuadrado.CalcularArea());
        System.out.println("Perimetro: " + cuadrado.CalcularPerimetro());

        //Circulo
        System.out.println("Circulo");
        System.out.println("ingrese el radio");
        float radio = scanner.nextFloat();

        Circulo circulo = new Circulo(radio);

        System.out.println("Area: " + circulo.CalcularArea());
        System.out.println("Perimetro: " + circulo.CalcularPerimetro());

        //Triangulo
        System.out.println("Triangulo");
        System.out.println("ingrese la base");
        float base = scanner.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = scanner.nextFloat();
        System.out.println("Ingrese el lado");
        float ladot = scanner.nextFloat();

        Triangulo triangulo = new Triangulo(base, altura, lado);

        System.out.println("Area: " + triangulo.CalcularArea());
        System.out.println("Perimetro: " + triangulo.CalcularPerimetro());
    }

}
