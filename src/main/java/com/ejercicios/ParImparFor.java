package com.ejercicios;

import java.util.ArrayList;

public class ParImparFor {
    private static final int LIMITE_INFERIOR =1;
    private static final int LIMITE_SUPERIOR =100;
    private ArrayList<Integer> numerosPares= new ArrayList();
    private ArrayList<Integer> numerosImpares= new ArrayList();

    public ParImparFor(){
        guardarNumeros();
        mostrarNumeros();
    }

    public ParImparFor(ArrayList<Integer> numerosPares, ArrayList<Integer> numerosImpares){
        this.numerosPares=numerosPares;
        this.numerosImpares=numerosImpares;
    }
    public void guardarNumeros() {
        for (int i = LIMITE_INFERIOR; i<= LIMITE_SUPERIOR; i++) {
            if (i% 2 == 0)
                numerosPares.add(i);
            else
                numerosImpares.add(i);
        }
    }

    public void mostrarNumeros() {
        System.out.println("Los números impares de " + LIMITE_INFERIOR + " hasta " + LIMITE_SUPERIOR + " son: ");
        System.out.println(numerosImpares);
        System.out.println("Los números pares de " + LIMITE_INFERIOR + " hasta " + LIMITE_SUPERIOR + " son: ");
        System.out.println(numerosPares);
    }
}
