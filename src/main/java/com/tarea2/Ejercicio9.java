package com.tarea2;
//Del texto, La sonrisa sera la mejor arma contra la tristeza Reemplaza todas las a del String anterior por una e,
//adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("___________________________________________________________________");
        String txt = new String("La sonrisa sera la mejor arma contra la tristeza");
        System.out.println("        "+txt);
        System.out.println(" ");
        String et = new String();
        et = txt.replace('a','e');

        System.out.println("        "+et);
        System.out.println("___________________________________________________________________");
        System.out.println(" ");
        System.out.println("Escribe una frase por favor");

        Scanner newText = new Scanner(System.in);
        String Concatext = newText.nextLine();
       //String sinSpace = Concatext.replaceAll( "\\+"," ");


        System.out.println(et+" "+Concatext);
        System.out.println("___________________________________________________________________");

    }
}
