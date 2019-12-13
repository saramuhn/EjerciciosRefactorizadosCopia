package com.ejercicios;

import java.util.Scanner;

public class Vocal {
    Scanner sc = new Scanner(System.in);
    private static final String FRASE = "La sonrisa sera la mejor arma contra la tristeza";
    private String fraseCambiada;
    private String frase;

    public Vocal(){
        cambiarVocales();
        pedirFrase();
        concatenarFrases();
    }
    public void cambiarVocales() {
        fraseCambiada=FRASE.replaceAll("a", "e");
        fraseCambiada=fraseCambiada.replaceAll("A", "E");
    }

    public void pedirFrase() {
        System.out.print("Ingrese frase a concatenar: ");
        frase = sc.nextLine();
    }

    public void concatenarFrases() {
        frase = fraseCambiada + " " + frase;
        System.out.print("La frase concatenada es: " + frase);
    }
}
