package com.tarea2;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

//Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por
// teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Calculemos el área de un circulo");
        System.out.println("Escribe el radio por favor");

        Scanner radio = new Scanner(System.in);
        int r = radio.nextInt();
        final double P = PI;

        double r2 =Math.pow(r,2);
        double area = P*r2;
        System.out.println("El área de tu circulo es: "+area);
    }
}
