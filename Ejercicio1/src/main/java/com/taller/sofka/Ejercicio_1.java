package com.taller.sofka;

import javax.swing.*;

//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también.
//Ve cambiando los valores para comprobar que funciona

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Hola, la humanidad ha perdido la cabeza totalmente y por tal motivo no se sabe si el 80 es mayor a 81");
        System.out.println("Aquí encontrarás la respuesta");
        System.out.println(" ");

        int a = 80;
        int b = 81;

            if (a<b){
                JOptionPane.showMessageDialog(null, "81 (b) ES EL MAYOR");
            }
            else if (b<a){
                JOptionPane.showMessageDialog(null, "80 (a) ES EL MAYOR");
            }
            else
                JOptionPane.showMessageDialog(null, "Son del mismo tamaño, increíble");
    }
}

