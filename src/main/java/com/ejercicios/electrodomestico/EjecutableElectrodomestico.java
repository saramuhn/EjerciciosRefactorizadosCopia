package com.ejercicios.electrodomestico;

public class EjecutableElectrodomestico {
    private Electrodomestico[] electrodomestico = new Electrodomestico[10];
    private double[] precioTelevision;
    private double[] precioLavadora;
    private double[] precioElectrodomestico;
    private double precioTotal;
    private double precioTotalElectrodomestico = 0;
    private double precioTotalLavadora = 0;
    private double precioTotalTelevision = 0;
    private int contadorElectrodomesticos = 0;
    private int contadorTelevision = 0;
    private int contadorLavadora = 0;

    public void ejecutar() {
        llenarArregloElectrodomestico();
        contarTipoElectrodomestico();
        precioTipoElectrodomestico();
        cantidadPrecioTipoElectrodomestico();
    }

    private void llenarArregloElectrodomestico() {
        electrodomestico[0] = new Electrodomestico(100, 80);
        electrodomestico[1] = new Electrodomestico(100, "Rojo", 'B', 70);
        electrodomestico[2] = new Lavadora();
        electrodomestico[3] = new Lavadora(100, 90);
        electrodomestico[4] = new Electrodomestico(100, "Gris", 'A', 90);
        electrodomestico[5] = new Electrodomestico();
        electrodomestico[6] = new Television(100, 20);
        electrodomestico[7] = new Television(100, "Negro", 'C', 30, 50, true);
        electrodomestico[8] = new Television();
        electrodomestico[9] = new Lavadora(100, "Azul", 'F', 55, 20);
    }

    private void contarTipoElectrodomestico() {
        for (int i = 0; i < electrodomestico.length; i++) {
            if (electrodomestico[i] instanceof Electrodomestico)
                contadorElectrodomesticos++;
            if (electrodomestico[i] instanceof Lavadora)
                contadorLavadora++;
            if (electrodomestico[i] instanceof Television)
                contadorTelevision++;
        }
        calcularPrecioTipoElectrodomestico(contadorElectrodomesticos, contadorLavadora, contadorTelevision);
    }

    private void calcularPrecioTipoElectrodomestico(int contadorElectrodomesticos, int contadorLavadora, int contadorTelevision) {
        precioElectrodomestico = new double[contadorElectrodomesticos];
        precioLavadora = new double[contadorLavadora];
        precioTelevision = new double[contadorTelevision];
        int auxiliarElectrodomesticos = 0;
        int auxiliarTelevision = 0;
        int auxiliarLavadora = 0;
        for (int i = 0; i < electrodomestico.length; i++) {
            if (electrodomestico[i] instanceof Electrodomestico) {
                precioElectrodomestico[auxiliarElectrodomesticos] = electrodomestico[i].precioFinal();
                auxiliarElectrodomesticos++;
            }
            if (electrodomestico[i] instanceof Lavadora) {
                precioLavadora[auxiliarLavadora] = electrodomestico[i].precioFinal();
                auxiliarLavadora++;
            }
            if (electrodomestico[i] instanceof Television) {
                precioTelevision[auxiliarTelevision] = electrodomestico[i].precioFinal();
                auxiliarTelevision++;
            }
        }
    }

    private void precioTipoElectrodomestico() {
        for (int i = 0; i < precioElectrodomestico.length; i++)
            precioTotalElectrodomestico = precioTotalElectrodomestico + precioElectrodomestico[i];
        for (int i = 0; i < precioLavadora.length; i++)
            precioTotalLavadora = precioTotalLavadora + precioLavadora[i];
        for (int i = 0; i < precioTelevision.length; i++)
            precioTotalTelevision = precioTotalTelevision + precioTelevision[i];
        precioTotal = precioTotalElectrodomestico + precioTotalLavadora + precioTotalTelevision;
    }

    private void cantidadPrecioTipoElectrodomestico() {
        System.out.println("Cantidad de Lavadoras fueron: " + contadorLavadora);
        for (int i = 0; i < precioLavadora.length; i++)
            System.out.println("Precio final Lavadora " + (i + 1) + " es: " + precioLavadora[i]);
        System.out.println("El precio final de Lavadoras en general es: " + precioTotalLavadora + "\n");

        System.out.println("Cantidad de Televisores fueron: " + contadorTelevision);
        for (int i = 0; i < precioTelevision.length; i++)
            System.out.println("Precio final Televisor " + (i + 1) + " es: " + precioTelevision[i]);
        System.out.println("El precio final de Televisores en general es: " + precioTotalTelevision + "\n");

        System.out.println("Cantidad de Electrodomesticos fueron: " + contadorElectrodomesticos);
        for (int i = 0; i < precioElectrodomestico.length; i++)
            System.out.println("Precio final Electrodomestico " + (i + 1) + " es: " + precioElectrodomestico[i]);
        System.out.println("El precio de Electrodomesticos es :" + precioTotalElectrodomestico);
        System.out.println("El precio de todos los Electrodomesticos en general es: " + precioTotal);
    }


}



