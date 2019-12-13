package com.ejercicios;

import java.util.Scanner;

public class DiaLaboral {
    private String diaSemana;
    Scanner sc = new Scanner(System.in);

    public DiaLaboral() {
        pedirDiaSemana();
        comprobarDiaLaboral();
    }

    public void pedirDiaSemana() {
        System.out.print("Ingrese día de la semana: ");
        diaSemana = sc.nextLine().toUpperCase();
    }

    public void comprobarDiaLaboral() {

            switch (diaSemana) {
                case "LUNES":
                case "MARTES":
                case "MIERCOLES":
                case "MIÉRCOLES":
                case "JUEVES":
                case "VIERNES":
                    System.out.println("Día laboral");
                   break;
                case "SABADO":
                case "SÁBADO":
                case "DOMINGO":
                    System.out.println("Día no laboral");
                    break;
                default:
                    System.out.println("Día no válido");
                    break;

        }
    }


}
