package com.tarea2;

import java.util.Scanner;

//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
public class Ejercicio10 {
    public static void main(String[] args) {

        System.out.println("Escribe una frase por favor");
        System.out.println(" ");
        Scanner text = new Scanner(System.in);
        String newTextSinEsp = text.nextLine();
        String sinE = newTextSinEsp.replaceAll("\\s+","");
        System.out.println(sinE);
    }
}
