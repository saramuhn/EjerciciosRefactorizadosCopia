package com.ejercicios.serievideojuego;

public class Serie implements Entregable {
    private static final int TEMPORADAS_MAYOR=1;
    private static final int TEMPORADAS_MENOR=0;
    private static final int NO_INSTANCIA=-1;
    private static final int NUMERO_TEMPORADAS_POR_DEFECTO=3;
    private static final boolean ENTREGADO_POR_DEFECTO=false;
    private String titulo = "";
    private int numeroTemporadas;
    private boolean entregado;
    private String genero = "";
    private String creador = "";

    public Serie() {
        this.entregado=ENTREGADO_POR_DEFECTO;
        this.numeroTemporadas=NUMERO_TEMPORADAS_POR_DEFECTO;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.entregado=ENTREGADO_POR_DEFECTO;
        this.numeroTemporadas=NUMERO_TEMPORADAS_POR_DEFECTO;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado=ENTREGADO_POR_DEFECTO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Titulo:'" + titulo +
                "\tNúmero de temporadas:" + numeroTemporadas +
                "\tGénero: " + genero +
                "\tCreador: " + creador;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object serieAComparar) {
        if (serieAComparar instanceof Serie) {
            Serie serie = (Serie) serieAComparar;
            if (numeroTemporadas >= serie.getNumeroTemporadas())
                return TEMPORADAS_MAYOR;
            else
                return TEMPORADAS_MENOR;
        }
        return NO_INSTANCIA;
    }
}
