package com.tarea2;

import java.util.Scanner;

//Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.
// Usa un switch para ello.
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Hola, ¿qué día es hoy? (número)");
        Scanner dia = new Scanner(System.in);
        int nuevoD = Integer.parseInt(dia.nextLine());

         switch (nuevoD){
             case 1:
                 System.out.println("Hoy es lunes, comienza con el pie derecho a laborar");
                 break;
             case 2:
                 System.out.println("Hoy es martes, comienza con el pie derecho a laborar");
                 break;
             case 3:
                 System.out.println("Hoy es miércoles, comienza con el pie derecho a laborar");
                 break;
             case 4:
                 System.out.println("Hoy es jueves, comienza con el pie derecho a laborar");
                 break;
             case 5:
                 System.out.println("Hoy es viernes, comienza con el pie derecho a laborar");
                 break;
             case 6:
                 System.out.println("Hoy es sábado, comienza con el pie derecho a laborar");
                 break;
             case 7:
                 System.out.println("Hoy es domingo, puedes hacer otras cosas, menos ir al trabajo");
                 break;
         }
    }
}
