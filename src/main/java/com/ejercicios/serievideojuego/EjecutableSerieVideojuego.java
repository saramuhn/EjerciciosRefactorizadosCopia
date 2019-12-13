package com.ejercicios.serievideojuego;



public class EjecutableSerieVideojuego {


    public  void ejecutar() {
        Serie[] serie = new Serie[5];
        Videojuego[] videojuego = new Videojuego[5];
        int cantidadSeriesEntregado = 0;
        int cantidadVideojuegosEntregado = 0;
        int posicionMayorSerie = 0;
        int posicionMayorVideojuego = 0;
        String muestraSerie;
        String muestraVideojuego;


        serie[0] = new Serie();
        serie[1] = new Serie("Game Of Thrones", "KING");
        serie[2] = new Serie("Dark", 10, "Ficción-Suspenso", "Alguien");
        serie[3] = new Serie("Grimm", "Otro alguien");
        serie[4] = new Serie();

        videojuego[0] = new Videojuego();
        videojuego[1] = new Videojuego("Mario", 20);
        videojuego[2] = new Videojuego("Crash", 20, "Aventura", "Game");
        videojuego[3] = new Videojuego("Joker", 10);
        videojuego[4] = new Videojuego();

        serie[1].entregar();
        serie[2].entregar();

        videojuego[1].entregar();
        videojuego[2].entregar();


        System.out.println("Series ");
        for (int i = 0; i < serie.length; i++) {
            if (serie[i].isEntregado()) {
                muestraSerie = serie[i].toString();
                System.out.println(muestraSerie);
                cantidadSeriesEntregado++;
            }
        }
        System.out.println("Series entregadas: " + cantidadSeriesEntregado + "\n");
        System.out.println("Videojuegos");
        for (int i = 0; i < videojuego.length; i++) {
            if (videojuego[i].isEntregado()) {
                muestraVideojuego = videojuego[i].toString();
                System.out.println(muestraVideojuego);
                cantidadVideojuegosEntregado++;
            }
        }
        System.out.println("Videojuegos entregados: " + cantidadVideojuegosEntregado + "\n");
        for (int i = 0; i < serie.length; i++) {
            if (serie[i].compareTo(serie[posicionMayorSerie]) == 1) {
                posicionMayorSerie = i;
            }

        }
        for (int i = 0; i < videojuego.length; i++) {
            if (videojuego[i].compareTo(videojuego[posicionMayorVideojuego]) == 1) {
                posicionMayorVideojuego = i;
            }
        }
        System.out.println("La serie con mayor número de temporadas es: \n" + serie[posicionMayorSerie].toString() + "\n");
        System.out.println("El videojuego con mayor número de horas es: \n" + videojuego[posicionMayorVideojuego].toString());

    }
}

