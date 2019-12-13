package com.ejercicios;

import java.util.Scanner;

public class MenuRepetido {
    Scanner sc = new Scanner(System.in);

    public MenuRepetido(){
        mostrarMenu();
        validarMenu();
    }
    public void validarMenu() {
        int opcionMenu;
        boolean salir = true;
        while (salir) {
            switch (opcionMenu = mostrarMenu()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    continue;
                case 8:
                    salir = false;
                    break;
                default:
                    System.out.println("Opción incorrecta \n");
                    continue;
            }
        }
    }

    public int mostrarMenu() {
        int opcion;
        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR\n");
        opcion = sc.nextInt();
        return opcion;
    }


}
