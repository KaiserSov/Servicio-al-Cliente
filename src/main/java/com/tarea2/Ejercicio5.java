package com.tarea2;

//Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("                      WHILE");
        System.out.println("----------------------------------------------------");
        System.out.println("  A continuación los números impares del 1 al 100");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");
        int i = 0;
        int p = 0;
        while (i<100)
        {
            i=i+1;
            if (i%2 != 0){
            System.out.println("° "+ +i);
            //break;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("   A continuación los números pares del 1 al 100");
        System.out.println("----------------------------------------------------");
        while (p<100)
        {
            p+=1;
            if (p%2 != 0) {
                System.out.println("° " + ++p);

                //break;
            }
        }
    }
}
