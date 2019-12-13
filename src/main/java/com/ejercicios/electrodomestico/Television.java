package com.ejercicios.electrodomestico;

public class Television extends Electrodomestico {
    protected double resolucion=20;
    protected boolean sintonizadorTDT=false;
    private static final int RESOLUCION_ESTANDAR=40;
    private static final double INCREMENTO_PRECIO=1.30;
    private static final int PRECIO_SINTONIZADOR=50;


    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precio=super.precioFinal();
        if (resolucion>=RESOLUCION_ESTANDAR)
            precio=precio*INCREMENTO_PRECIO;
        if(sintonizadorTDT)
            precio=precio+PRECIO_SINTONIZADOR;

        return precio;
    }
}
