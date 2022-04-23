package com.tarea2;
//    Hacer un programa que muestre el siguiente menú de opciones
//    ****** GESTION CINEMATOGRAFICA ********
//    1-NUEVO ACTOR
//    2-BUSCAR ACTOR
//    3-ELIMINAR ACTOR
//    4-MODIFICAR ACTOR
//    5-VER TODOS LOS ACTORES
//    6-VER PELICULAS DE LOS ACTORES
//    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
//    8-SALIR
//
//EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO
//EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
//PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int cla;
        do {
            System.out.println("Escribe el 8 por favor");
            Scanner clave = new Scanner(System.in);
            cla = clave.nextInt();
            //break;
        } while (cla!=8);

        System.out.println("************* GESTION CINEMATOGRAFICA **************");
        System.out.println("|                  1-NUEVO ACTOR                   |");
        System.out.println("|                  2-BUSCAR ACTOR                  |");
        System.out.println("|                 3-ELIMINAR ACTOR                 |");
        System.out.println("|                4-MODIFICAR ACTOR                 |");
        System.out.println("|              5-VER TODOS LOS ACTORES             |");
        System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
        System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
        System.out.println("|                     8-SALIR                      |");
        System.out.println("****************************************************");

        System.out.println("Introduce una opción por favor");
        Scanner numing = new Scanner(System.in);
        int numin = numing.nextInt();

        switch (numin){
            case 1:
            {
                System.out.println("Nuevo actor:");
                Scanner nuActor = new Scanner(System.in);
                String na = nuActor.nextLine();
                System.out.println("Gracias, le enviaremos un correo de confirmacion");
                System.out.println(" ");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 2:
            {
                System.out.println("Buscar actor");
                Scanner buActor = new Scanner(System.in);
                String ba = buActor.nextLine();
                System.out.println("Buscaremos a: "+ "y le diremos que se comunique pronto");
                System.out.println(" ");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 3:
            {
                System.out.println("Eliminar actor");
                System.out.println("¿A quien borramos?");
                Scanner eliActor = new Scanner(System.in);
                int elia = eliActor.nextInt();
                System.out.println("Listo");
                System.out.println(" ");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 4:
            {
                System.out.println("Modificar actor");
                Scanner modiActor = new Scanner(System.in);
                String modia = modiActor.nextLine();
                System.out.println("Se guardó");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 5:
            {
                System.out.println("Ver todos los actores:");
                System.out.println("Leonardo Dicaprio");
                System.out.println("Johnny Deep");
                System.out.println("Timothee Chalamet");
                System.out.println("Kathy Bates");
                System.out.println("Meryl Streep");
                System.out.println("Keira Knightley");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 6:
            {
                System.out.println("Ver peliculas de los actores:");
                System.out.println("Anna Karenina");
                System.out.println("Catch me if you can");
                System.out.println("Misery");
                System.out.println("Los Puentes de Madison");
                System.out.println("Dune");
                System.out.println("Piratas del Caribe");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 7:
            {
                System.out.println("Ver categoria de las peliculas de los actores:");
                System.out.println("Tenemos de todas las categorías");
                System.out.println("************* GESTION CINEMATOGRAFICA **************");
                System.out.println("|                  1-NUEVO ACTOR                   |");
                System.out.println("|                  2-BUSCAR ACTOR                  |");
                System.out.println("|                 3-ELIMINAR ACTOR                 |");
                System.out.println("|                4-MODIFICAR ACTOR                 |");
                System.out.println("|              5-VER TODOS LOS ACTORES             |");
                System.out.println("|           6-VER PELICULAS DE LOS ACTORES         |");
                System.out.println("|  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES |");
                System.out.println("|                     8-SALIR                      |");
                System.out.println("****************************************************");
                System.out.println("Introduce una opción por favor");
                numin = numing.nextInt();
            }
            case 8:
            {
                System.out.println("Salir");
                break;
            }
            default:
            {
                System.out.println("Opcion incorrecta");
            }
        }
    }
}
