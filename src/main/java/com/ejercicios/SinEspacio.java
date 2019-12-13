package com.ejercicios;

import java.util.Scanner;

public class SinEspacio {
    Scanner sc = new Scanner(System.in);
    private String frase;

    public SinEspacio(){
        ingresarFrase();
        quitarEspacios();
    }
    public void ingresarFrase(){
        System.out.print("Ingrese frase: ");
        frase=sc.nextLine();
    }
    public void quitarEspacios(){
        System.out.println(frase.replaceAll("\\s",""));
    }



}
