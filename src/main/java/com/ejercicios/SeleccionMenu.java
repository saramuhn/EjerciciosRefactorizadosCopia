package com.ejercicios;

import com.ejercicios.electrodomestico.EjecutableElectrodomestico;
import com.ejercicios.persona.EjecutablePersona;
import com.ejercicios.serievideojuego.EjecutableSerieVideojuego;

import java.util.Scanner;

public class SeleccionMenu {

    private static final int NUMEROS_ESTATICOS = 1;
    private static final int NUMEROS_CONSOLA = 2;
    private static final int AREA_CIRCULO = 3;
    private static final int PRECIO_IVA = 4;
    private static final int PARES_IMPARES_WHILE = 5;
    private static final int PARES_IMPARES_FOR = 6;
    private static final int NUMERO_MAYOR_CERO = 7;
    private static final int DIA_LABORAL = 8;
    private static final int CAMBIAR_VOCALES_CONCATENAR = 9;
    private static final int ELIMINAR_ESPACIOS = 10;
    private static final int LONGITUD_FRASE_VOCALES = 11;
    private static final int PALABRAS_IGUALES = 12;
    private static final int FORMATO_FECHA = 13;
    private static final int NUMERO_DOS_EN_DOS = 14;
    private static final int MENU_REPETIDO = 15;
    private static final int PERSONA = 16;
    private static final int ELECTRODOMESTICO_LAVADORA_TELEVISOR = 17;
    private static final int SERIE_VIDEOJUEGO = 18;
    private static final int SALIR = 0;


    public static void mostrarMenu() {
        System.out.println("\n******** Ejercicios de JAVA ********");
        System.out.println("1- Comparar números estáticos.");
        System.out.println("2- Comparar números ingresados por consola.");
        System.out.println("3- Calcular área de un círculo.");
        System.out.println("4- Calcular precio final de un producto con IVA.");
        System.out.println("5- Mostrar números pares e impares con bucle While.");
        System.out.println("6- Mostrar números pares e impares con bucle For");
        System.out.println("7- Comprobar número mayor a cero.");
        System.out.println("8- Comprobar día laboral o no.");
        System.out.println("9- Cambiar vocales de una frase y concatenarle otra.");
        System.out.println("10- Eliminar espacios de una frase");
        System.out.println("11- Indicar longitud de frase y cantidad de vocales.");
        System.out.println("12- Indicar si dos palabras ingresadas son iguales y mostrar diferencias.");
        System.out.println("13- Consultar formato de fecha.");
        System.out.println("14- Imprimir números hasta el 1000 con saltos de dos.");
        System.out.println("15- Mostrar menú repetidas veces.");
        System.out.println("16- Validar información de una Persona.");
        System.out.println("17- Crear Electrodomésticos con Lavadoras y Televisores");
        System.out.println("18- Utilizar la información de Series y Videojuegos.");
        System.out.println("0- Para salir");

    }

    public static void seleccionEjercicio() {
        int opcionMenu;
        do {
            opcionMenu=obtenerOpcionMenu();
            switch (opcionMenu) {
                case NUMEROS_ESTATICOS:
                    NumeroEstatico numeroEstatico = new NumeroEstatico();
                    numeroEstatico.compararNumeros();
                    continue;
                case NUMEROS_CONSOLA:
                    NumeroConsola numeroConsola;
                    numeroConsola = new NumeroConsola();
                    continue;
                case AREA_CIRCULO:
                    AreaCirculo areaCirculo = new AreaCirculo();
                    continue;
                case PRECIO_IVA:
                    PrecioIVA precioIVA = new PrecioIVA();
                    continue;
                case PARES_IMPARES_WHILE:
                    ParImparWhile paresImparesWhile = new ParImparWhile();
                    continue;
                case PARES_IMPARES_FOR:
                    ParImparFor parImparFor = new ParImparFor();
                    continue;
                case NUMERO_MAYOR_CERO:
                    NumeroMayorCero numeroMayorCero = new NumeroMayorCero();
                    numeroMayorCero.comprobarNumero();
                    continue;
                case DIA_LABORAL:
                    DiaLaboral diaLaboral = new DiaLaboral();
                    continue;
                case CAMBIAR_VOCALES_CONCATENAR:
                    Vocal vocal = new Vocal();
                    continue;
                case ELIMINAR_ESPACIOS:
                    SinEspacio sinEspacio = new SinEspacio();
                    continue;
                case LONGITUD_FRASE_VOCALES:
                    Frase frase = new Frase();
                    continue;
                case PALABRAS_IGUALES:
                    Palabra palabra = new Palabra();
                    continue;
                case FORMATO_FECHA:
                    FormatoFecha formatoFecha = new FormatoFecha();
                    continue;
                case NUMERO_DOS_EN_DOS:
                    NumeroDosEnDos numeroDosEnDos = new NumeroDosEnDos();
                    continue;
                case MENU_REPETIDO:
                    MenuRepetido menuRepetido = new MenuRepetido();
                    continue;
                case PERSONA:
                    EjecutablePersona persona = new EjecutablePersona();
                    persona.ejecutar();
                    continue;
                case ELECTRODOMESTICO_LAVADORA_TELEVISOR:
                    EjecutableElectrodomestico electrodomestico = new EjecutableElectrodomestico();
                    electrodomestico.ejecutar();
                    continue;
                case SERIE_VIDEOJUEGO:
                    EjecutableSerieVideojuego dieciocho = new EjecutableSerieVideojuego();
                    dieciocho.ejecutar();
                    continue;
                default:
                    opcionMenu = SALIR;
            }
        }
        while (opcionMenu != SALIR);
    }

    public static int obtenerOpcionMenu() {
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        mostrarMenu();
        opcionMenu = sc.nextInt();
        return opcionMenu;
    }

}
