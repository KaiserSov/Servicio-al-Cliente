package com.tarea2;

import java.util.Scanner;

//Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Hola, la humanidad ha perdido la cabeza totalmente y por tal motivo no sabe diferenciar números mayores entre sí");
        System.out.println("Aquí encontrarás la respuesta");
        System.out.println(" ");

        System.out.println("Escribe el número 'a' por favor");
        Scanner numingA = new Scanner(System.in);
        int a = numingA.nextInt();

        System.out.println("Escribe el número 'b' por favor");
        Scanner numingB = new Scanner(System.in);
        int b = numingB.nextInt();

        if (a<b){
            System.out.println(" ");
            System.out.println("El mayor es: b "+ b);
        }
        else if (b<a){
            System.out.println(" ");
            System.out.println("El mayor es: a"+ a);
        }
        else
        {
            System.out.println(" ");
            System.out.println("Son del mismo tamaño, increíble");
        }
    }
}


