package com.ejercicios;

import java.util.Scanner;

public class NumeroConsola {

    Scanner sc = new Scanner(System.in);
    private static final int MAYOR = 1;
    private static final int MENOR = -1;
    private static final int IGUAL = 0;
    protected double numeroUno;
    protected double numeroDos;
    protected int estadoNumero;

    public NumeroConsola(double numeroUno, double numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;
    }
    public NumeroConsola() {
        ingresarNumeros();
        compararNumeros();
        mostrarComparacion();
    }

    public void ingresarNumeros() {
        System.out.print("Ingrese número Uno: ");
        numeroUno = sc.nextDouble();
        System.out.print("Ingrese número Dos: ");
        numeroDos = sc.nextDouble();
    }

    public void compararNumeros() {
        if ((numeroUno != numeroDos)) {
            if (numeroUno > numeroDos)
                estadoNumero = MAYOR;
            else
                estadoNumero = MENOR;
        } else
            estadoNumero = IGUAL;
    }

    public void mostrarComparacion() {
        if (estadoNumero == MAYOR)
            System.out.println("El número " + numeroUno + " es mayor que " + numeroDos);
        if (estadoNumero == MENOR)
            System.out.println("El número " + numeroDos + " es mayor que " + numeroUno);
        if (estadoNumero == IGUAL)
            System.out.println("Los números son iguales.");
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
}
