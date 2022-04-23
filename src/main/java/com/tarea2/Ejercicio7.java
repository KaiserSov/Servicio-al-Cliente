package com.tarea2;

import java.util.Scanner;

//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
// después muestra ese número por consola.
public class Ejercicio7 {
    public static void main(String[] args) {

        int numi;
        do {
            System.out.println("Escribe un número que sea positivo por favor");
            Scanner numing = new Scanner(System.in);
            numi = numing.nextInt();
            //break;
        } while (numi <= 0);
        System.out.println("El número es correcto");
    }
}
