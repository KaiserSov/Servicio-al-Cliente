package com.tarea2;

import java.util.Scanner;

//Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
// indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de a,e,i,o,u.
public class Ejercicio11 {
    public static void main(String[] args) {

        System.out.println("Escribe una frase por favor");
        Scanner text = new Scanner(System.in);
        String longi = text.nextLine();
        System.out.println(" ");
        System.out.println("Su frase tiene: "+longi.length()+" letras");

        int letA = 0;
        char probar;
        for (int a = 0; a < longi.length(); a++) {

            probar = longi.charAt(a);
            if (probar == 'a')
                letA++;
        }

        int letE = 0;
        char probarE;
        for (int e = 0; e < longi.length(); e++) {

            probarE = longi.charAt(e);
            if (probarE == 'e')
                letE++;
        }

        int letI = 0;
        char probarI;
        for (int i = 0; i < longi.length(); i++) {

            probarI = longi.charAt(i);
            if (probarI == 'i')
                letI++;
        }

        int letO = 0;
        char probarO;
        for (int o = 0; o < longi.length(); o++) {

            probarO = longi.charAt(o);
            if (probarO == 'o')
                letO++;
        }

        int letU = 0;
        char probarU;
        for (int u = 0; u < longi.length(); u++) {

            probarU = longi.charAt(u);
            if (probarU == 'u')
                letU++;
        }
        System.out.println("Con: "+letA+" letra: a");
        System.out.println("Con: "+letE+" letra: e");
        System.out.println("Con: "+letI+" letra: i");
        System.out.println("Con: "+letO+" letra: o");
        System.out.println("Con: "+letU+" letra: u");

        System.out.println(" ");
        System.out.println("Gracias");
        System.out.println("----------------------------------------------------");
    }
}
