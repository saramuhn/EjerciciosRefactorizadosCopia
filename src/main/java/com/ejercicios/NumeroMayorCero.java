package com.ejercicios;

import java.util.Scanner;

public class NumeroMayorCero {
    Scanner sc = new Scanner(System.in);
    private double numero;

    public void comprobarNumero() {
        do {
            ingresarNumero();
            if (numero >= 0) {
                System.out.println("Número mayor o igual a cero: " + numero);
                break;
            }
        } while (numero != 0);
    }

    public void ingresarNumero() {
        System.out.print("Ingrese número: ");
        numero = sc.nextDouble();
    }

}
