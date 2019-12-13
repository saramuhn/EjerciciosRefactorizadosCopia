package com.ejercicios.electrodomestico;

public class Electrodomestico {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    private static final String COLOR_POR_DEFECTO = "Blanco";
    private static final char CONSUMO_POR_DEFECTO = 'F';
    private static final double PESO_POR_DEFECTO = 5;
    private static final int PRECIO_BASE = 100;
    private static final int PRECIO_CONSUMO_A = 100;
    private static final int PRECIO_CONSUMO_B = 80;
    private static final int PRECIO_CONSUMO_C = 60;
    private static final int PRECIO_CONSUMO_D = 50;
    private static final int PRECIO_CONSUMO_E = 30;
    private static final int PRECIO_CONSUMO_F = 10;
    private static final char CONSUMO_A = 'A';
    private static final char CONSUMO_B = 'B';
    private static final char CONSUMO_C = 'C';
    private static final char CONSUMO_D = 'D';
    private static final char CONSUMO_E = 'E';


    public Electrodomestico() {
        comprobarConsumoPrecio();
        comprobarColor();
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        comprobarConsumoPrecio();
        comprobarColor();
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarColor();
        comprobarConsumoPrecio();
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoPrecio() {
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        switch (consumoEnergetico) {
            case CONSUMO_A:
                consumoEnergetico = CONSUMO_A;
                precio = precio + PRECIO_CONSUMO_A;
                break;
            case CONSUMO_B:
                consumoEnergetico = CONSUMO_B;
                precio = precio + PRECIO_CONSUMO_B;
                break;
            case CONSUMO_C:
                consumoEnergetico = CONSUMO_C;
                precio = precio + PRECIO_CONSUMO_C;
                break;
            case CONSUMO_D:
                consumoEnergetico = CONSUMO_D;
                precio = precio + PRECIO_CONSUMO_D;
                break;
            case CONSUMO_E:
                consumoEnergetico = CONSUMO_E;
                precio = precio + PRECIO_CONSUMO_E;
                break;
            case CONSUMO_POR_DEFECTO:
                consumoEnergetico = CONSUMO_POR_DEFECTO;
                precio = precio + PRECIO_CONSUMO_F;
                break;
            default:
                consumoEnergetico = CONSUMO_POR_DEFECTO;
                precio = PRECIO_BASE;
        }
    }

    private void comprobarColor() {
        color=color.toUpperCase();
        if ("BLANCO".equals(color)) {
            color = COLOR_POR_DEFECTO;
        } else if ("NEGRO".equals(color)) {
            color = "Negro";
        } else if ("ROJO".equals(color)) {
            color = "Rojo";
        } else if ("AZUL".equals(color)) {
            color = "Azul";
        } else if ("GRIS".equals(color)) {
            color = "Gris";
        } else {
            color = COLOR_POR_DEFECTO;
        }
    }

    public double precioFinal() {
        precio = precio + precioPeso();
        return precio;
    }


    public double precioPeso() {
        if (peso >= 0 && peso <= 19)
            precio = 10;
        if (peso >= 20 && peso <= 49)
            precio = 50;
        if (peso >= 50 && peso <= 79)
            precio = 80;
        if (peso >= 80)
            precio = 100;

        return precio;
    }

    public void setColor(String color) { this.color = color; }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
