package com.ejercicios.persona;

import java.util.Scanner;

public class EjecutablePersona {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Persona personaEstandar = ingresoDatosCompletoPersona();
        Persona personaParcial = ingresoDatosParcialesPersona();
        Persona personaPorDefecto = ingresoDatosPorDefectoPersona();

        mostrarDatosPersona(personaEstandar);
        calculoDatosPersona(personaEstandar);

        mostrarDatosPersona(personaParcial);
        calculoDatosPersona(personaParcial);

        mostrarDatosPersona(personaPorDefecto);
        calculoDatosPersona(personaPorDefecto);
    }

    private static Persona ingresoDatosCompletoPersona() {
        System.out.print("Ingrese nombre de la primera Persona: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese edad de la primera Persona: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese peso de la primera Persona: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese altura de la primera Persona: ");
        double altura = sc.nextDouble();
        System.out.print("Ingrese sexo de la primera Persona (M para Mujer y H para Hombre): ");
        char sexo = sc.next().charAt(0);
        Persona personaEstandar;
        personaEstandar = new Persona(nombre, edad, peso, altura, sexo);
        return personaEstandar;
    }

    public static void mostrarDatosPersona(Persona persona) {
        String toStringPersona;
        System.out.println("\n-----------------------");
        toStringPersona = persona.toString();
        System.out.println(toStringPersona);
    }

    public static void calculoDatosPersona(Persona persona) {
        persona.calcularPesoIdeal();
        persona.mostrarEsMayorDeEdad();
    }

    private static Persona ingresoDatosParcialesPersona() {
        Persona personaParcial;
        personaParcial = new Persona("Maria antonia", 2, 'M');
        return personaParcial;
    }

    private static Persona ingresoDatosPorDefectoPersona() {
        Persona personaPorDefecto = new Persona();
        personaPorDefecto.setNombre("Sara");
        personaPorDefecto.setEdad(22);
        personaPorDefecto.setAltura(1.60);
        personaPorDefecto.setPeso(86.5);
        personaPorDefecto.setSexo('M');
        return personaPorDefecto;
    }


}


