package com.ejercicios;

import java.util.Scanner;

public class NumeroDosEnDos {
    Scanner sc = new Scanner(System.in);
    private static final int LIMITE= 1000;
    private int numero;

    public NumeroDosEnDos(){
        pedirNumero();
        imprimirNumeros();
    }

    public void pedirNumero(){
        System.out.print("Ingrese número: ");
        numero=sc.nextInt();
    }

    public void imprimirNumeros(){
        System.out.println("Números ");
        for(int i=numero; i<=LIMITE;i+=2)
            System.out.print(i +"\t");
    }
}
