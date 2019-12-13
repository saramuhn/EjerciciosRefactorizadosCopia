package com.ejercicios.persona;

import java.util.Random;

public class Persona {
    protected String nombre = "";
    protected int edad = 0;
    protected String dni;
    protected double peso = 0;
    protected double altura = 0;
    protected char sexo;
    private Random r = new Random();

    private static final char SEXO_POR_DEFECTO = 'H';
    private static final int MAYORIA_EDAD = 18;
    private static final char SEXO_MUJER = 'M';
    private static final char SEXO_HOMBRE = 'H';
    private static final int SOBREPESO = 1;
    private static final int BAJO_PESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int IMC_SOBREPESO = 25;
    private static final int IMC_BAJO_PESO = 20;


    public Persona() {
        dni = generarDNI();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = generarDNI();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
        comprobarSexo();
    }

    public double calcularImc() {
        double pesoIdeal = (peso / Math.pow(altura, 2));
        if (pesoIdeal < IMC_BAJO_PESO)
            pesoIdeal = BAJO_PESO;
        if (pesoIdeal >= IMC_BAJO_PESO && pesoIdeal <= IMC_SOBREPESO)
            pesoIdeal = PESO_IDEAL;
        if (pesoIdeal > IMC_SOBREPESO)
            pesoIdeal = SOBREPESO;

        return pesoIdeal;
    }

    public void calcularPesoIdeal() {
        double pesoIdeal = calcularImc();
        if (pesoIdeal == BAJO_PESO)
            System.out.println("Tiene Bajo de Peso");
        if (pesoIdeal == SOBREPESO)
            System.out.println("Tiene Sobrepeso");
        if (pesoIdeal == PESO_IDEAL)
            System.out.println("Tiene Peso ideal");

    }

    private boolean esMayorDeEdad() {
        boolean mayor;
        if (edad >= MAYORIA_EDAD)
            mayor = true;
        else
            mayor = false;
        return mayor;
    }

    protected void mostrarEsMayorDeEdad() {
        boolean mayor = esMayorDeEdad();
        if (mayor)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    private void comprobarSexo() {
        if (sexo == SEXO_MUJER)
            this.sexo = SEXO_MUJER;
        else {
            if (sexo != SEXO_HOMBRE)
                this.sexo = SEXO_POR_DEFECTO;
        }
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\tEdad:" + edad +
                "\tDNI:" + dni +
                "\tPeso:" + peso +
                "\tAltura:" + altura +
                "\tSexo:" + sexo;
    }

    private String generarDNI() {
        int dniAleatorio = r.nextInt(90000000) + 10000000;
        String letraDNI;
        letraDNI = Character.toString(generarLetraDNI(dniAleatorio));
        dni = String.valueOf(dniAleatorio) + "-" + letraDNI;
        return dni;
    }

    private char generarLetraDNI(int dni) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return caracteres.charAt(resto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        comprobarSexo();
    }

}
