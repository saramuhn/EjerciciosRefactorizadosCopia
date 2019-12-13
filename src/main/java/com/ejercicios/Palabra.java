package com.ejercicios;

import java.util.Scanner;

public class Palabra {
    Scanner sc = new Scanner(System.in);
    private String primeraPalabra;
    private String segundaPalabra;
    private char[] palabraUnoSeparadoPorCaracter;
    private char[] palabraDosSeparadoPorCaracter;
    private char[] diferencias;
    private int auxiliarTamanio = 0;
    private int contadorDiferencias = 0;

    public Palabra() {
        pedirPalabras();
        compararPalabras();
        diferencias = encontrarDiferencias();
        mostrarDiferencias();
    }

    public void pedirPalabras() {
        System.out.print("Ingrese primera palabra: ");
        primeraPalabra = sc.nextLine();
        System.out.print("Ingrese segunda palabra: ");
        segundaPalabra = sc.nextLine();
    }

    public void compararPalabras() {
        palabraUnoSeparadoPorCaracter = primeraPalabra.toCharArray();
        palabraDosSeparadoPorCaracter = segundaPalabra.toCharArray();

        if (palabraUnoSeparadoPorCaracter.length > palabraDosSeparadoPorCaracter.length)
            auxiliarTamanio = palabraUnoSeparadoPorCaracter.length;
        else
            auxiliarTamanio = palabraDosSeparadoPorCaracter.length;
    }

    public char[] encontrarDiferencias() {
        diferencias = new char[auxiliarTamanio];
        int i;
        for (i = 0; i < auxiliarTamanio; i++) {
            if (i < palabraUnoSeparadoPorCaracter.length && i < palabraDosSeparadoPorCaracter.length) {
                if (palabraUnoSeparadoPorCaracter[i] != palabraDosSeparadoPorCaracter[i]) {
                    diferencias[contadorDiferencias] = palabraDosSeparadoPorCaracter[i];
                    contadorDiferencias++;
                } else {
                    if (palabraUnoSeparadoPorCaracter.length == palabraDosSeparadoPorCaracter.length)
                        diferencias[contadorDiferencias] = ' ';
                }
            } else
                break;
        }
        if (i < palabraUnoSeparadoPorCaracter.length) {
            for (int j = i; j < palabraUnoSeparadoPorCaracter.length; j++) {
                diferencias[contadorDiferencias] = palabraUnoSeparadoPorCaracter[j];
                contadorDiferencias++;
            }
        } else {
            for (int j = i; j < palabraDosSeparadoPorCaracter.length; j++) {
                diferencias[contadorDiferencias] = palabraDosSeparadoPorCaracter[j];
                contadorDiferencias++;
            }
        }
        return diferencias;
    }

    public void mostrarDiferencias() {

        if (contadorDiferencias == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.print("Diferencias: ");
            for (int i = 0; i < diferencias.length; i++) {
                if (diferencias[i] != ' ') {
                    System.out.print(diferencias[i] + " \t");
                    contadorDiferencias++;
                }
            }
        }
    }
}