package com.ejercicios;

import java.util.Scanner;

public class PrecioIVA {
    public static final double IVA = 1.21;
    private double precioProducto;
    Scanner sc = new Scanner(System.in);

    public PrecioIVA(){
        ingresarPrecio();
        calcularPrecioProducto();
        mostrarPrecioProducto();
    }
    public void ingresarPrecio() {
        System.out.print("Ingrese precio del producto: ");
        precioProducto = sc.nextDouble();
    }

    public void calcularPrecioProducto() {
        precioProducto = precioProducto * IVA;
    }

    public void mostrarPrecioProducto() {
        System.out.println("El precio final del producto es: " + precioProducto);
    }
}
