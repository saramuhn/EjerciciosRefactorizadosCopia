package com.ejercicios;

import java.util.Scanner;

public class Frase {
    Scanner sc = new Scanner(System.in);
    private String frase;
    private char[] fraseSeparadaPorCaracter;
    private int contadorVocalA = 0;
    private int contadorVocalE = 0;
    private int contadorVocalI = 0;
    private int contadorVocalO = 0;
    private int contadorVocalU = 0;
    private int contadorSinVocal = 0;

    public Frase() {
        ingresarFrase();
        longitudFrase();
        mostrarLongitudFrase();
        contarVocales();
        mostrarCantidadVocales();
    }

    public void ingresarFrase() {
        System.out.print("Ingrese frase: ");
        frase = sc.nextLine().toUpperCase();
    }

    public void longitudFrase() {
        fraseSeparadaPorCaracter = frase.toCharArray();
    }

    public void mostrarLongitudFrase() {
        System.out.println("La longitud de la frase es: " + frase.length());
    }

    public void contarVocales() {
        for (int i = 0; i < fraseSeparadaPorCaracter.length; i++) {
            switch (fraseSeparadaPorCaracter[i]) {
                case 'A':
                    contadorVocalA++;
                    continue;
                case 'E':
                    contadorVocalE++;
                    continue;
                case 'I':
                    contadorVocalI++;
                    continue;
                case 'O':
                    contadorVocalO++;
                    continue;
                case 'U':
                    contadorVocalU++;
                    continue;
                case ' ':
                    continue;
                default:
                    continue;
            }
        }
    }

    public void mostrarCantidadVocales() {
        if (contadorVocalA != 0)
            System.out.println("Cantidad de vocales A: " + contadorVocalA);
        if (contadorVocalE != 0)
            System.out.println("Cantidad de vocales E: " + contadorVocalE);
        if (contadorVocalI != 0)
            System.out.println("Cantidad de vocales I: " + contadorVocalI);
        if (contadorVocalO != 0)
            System.out.println("Cantidad de vocales O: " + contadorVocalO);
        if (contadorVocalU != 0)
            System.out.println("Cantidad de vocales U: " + contadorVocalU);
        if (contadorVocalA == 0 && contadorVocalE == 0 && contadorVocalI == 0 && contadorVocalO == 0 && contadorVocalU == 0)
            System.out.println("No tiene vocales");
    }
}

