package com.ejercicios.electrodomestico;

public class Lavadora extends Electrodomestico {
    protected double carga= 5;
    private static final int CARGA_PRECIO=30;
    private static final int PRECIO_CARGA=50;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public double precioFinal(){
        double precio=super.precioFinal();
        if(carga>= CARGA_PRECIO)
            precio=precio+PRECIO_CARGA;
        return precio;
    }

}
