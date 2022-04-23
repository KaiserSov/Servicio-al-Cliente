package com.tarea2;

import java.util.Scanner;

//Crear un programa que pida un numero por teclado y que imprima por pantalla los
// números desde el numero introducido hasta 1000 con saltos de 2 en 2.
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduce un número por favor");
        Scanner numin = new Scanner(System.in);
        int otnumin = numin.nextInt();
        System.out.println("Los números del: " + otnumin + " hasta el 1000 son:");
        //int i  = 0;
        for (int i = otnumin+1;i<=1000;++i){
            i=i+1;
            System.out.println("° " +i);
        }

    }
}
