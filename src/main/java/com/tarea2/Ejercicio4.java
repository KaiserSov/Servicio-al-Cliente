package com.tarea2;

import java.util.Scanner;

//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
//El IVA sera una constante que sera del 21%
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("-----------------------------------");
        System.out.println("          Buenas tardes");
        System.out.println("-----------------------------------");
        System.out.println("  Ingrese el precio del producto:");
        System.out.println(" ");
        Scanner precio = new Scanner(System.in);
        double p = precio.nextInt();
        System.out.println("-----------------------------------");
        final double iva = 21;

        double ivaT = iva*p/100;
        double total = p+ivaT;

        System.out.println("              Subtotal: "+p);
        System.out.println("              IVA 21%:  "+ivaT);
        System.out.println("              total:    "+total);
        System.out.println("-----------------------------------");
        System.out.println("    Hasta luego, vuelva pronto");
    }
}
