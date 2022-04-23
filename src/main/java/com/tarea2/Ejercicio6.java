package com.tarea2;

//Realiza el ejercicio anterior usando un ciclo for.
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("                      FOR");
        System.out.println("----------------------------------------------------");
        System.out.println("  A continuación los números impares del 1 al 100");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");

        for (int i = 0;i<100; ++i){
            i=i+1;
            System.out.println("° "+i);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("   A continuación los números pares del 1 al 100");
        System.out.println("----------------------------------------------------");
        for (int i = 1;i<100; ++i){
            i=i+1;
            System.out.println("° "+i);
        }
    }
}
