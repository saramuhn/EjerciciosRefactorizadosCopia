package com.ejercicios;

public class NumeroEstatico {
    private static final double NUMERO_UNO = 0;
    private static final double NUMERO_DOS = 0;
   NumeroConsola numeroConsola = new NumeroConsola(NUMERO_UNO,NUMERO_DOS);

    public void compararNumeros() {
        numeroConsola.compararNumeros();
        numeroConsola.mostrarComparacion();
    }
}
