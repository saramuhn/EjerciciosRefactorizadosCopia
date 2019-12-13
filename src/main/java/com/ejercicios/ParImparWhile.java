package com.ejercicios;

import java.util.ArrayList;

public class ParImparWhile {
    private static final int LIMITE_INFERIOR = 1;
    private static final int LIMITE_SUPERIOR = 100;
    private ArrayList<Integer> numerosPares = new ArrayList();
    private ArrayList<Integer> numerosImpares = new ArrayList();

    public ParImparWhile(){
        guardarNumeros();
        mostrarNumeros();
    }
    public void guardarNumeros() {
        int auxiliarContador = LIMITE_INFERIOR;
        while (auxiliarContador != LIMITE_SUPERIOR + 1) {
            if (auxiliarContador % 2 == 0)
                numerosPares.add(auxiliarContador);
            else
                numerosImpares.add(auxiliarContador);
            auxiliarContador++;
        }
    }

    public void mostrarNumeros() {
        ParImparFor parImparFor = new ParImparFor(numerosPares, numerosImpares);
        parImparFor.mostrarNumeros();
    }


}
