package com.tarea2;

import java.util.Scanner;

//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Buenas tardes, por favor escribe una palabra");
        Scanner palabra1 = new Scanner(System.in);
        String palu = palabra1.nextLine();
        System.out.println(" ");

        System.out.println("Por favor escribe otra palabra");
        Scanner palabra2 = new Scanner(System.in);
        String pald = palabra1.nextLine();

        if (palu == pald){
            System.out.println("La palabra: "+palu+" es igual a: "+pald);
        }
        else {
            System.out.println();
        }
    }
}
