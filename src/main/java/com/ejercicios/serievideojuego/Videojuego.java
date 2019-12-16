package
        com.ejercicios.serievideojuego;

public class Videojuego implements Entregable {
    private static final boolean ENTREGADO_POR_DEFECTO=false;
    private static final int HORAS_ESTIMADAS_POR_DEFECTO=10;
    private static final int HORAS_MAYOR=1;
    private static final int HORAS_MENOR=0;
    private static final int NO_INSTANCIA=-1;
    private String titulo = "";
    private int horasEstimadas;
    private boolean entregado;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
        this.horasEstimadas=HORAS_ESTIMADAS_POR_DEFECTO;
        this.entregado=ENTREGADO_POR_DEFECTO;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado=ENTREGADO_POR_DEFECTO;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado=ENTREGADO_POR_DEFECTO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Titulo:'" + titulo +
                "\tHoras estimadas: " + horasEstimadas +
                "\tGénero:" + genero + '\'' +
                "\tCompañia: '" + compania;
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
    public int compareTo(Object videojuegoAComparar) {
        if (videojuegoAComparar instanceof Videojuego) {
            Videojuego videojuego = (Videojuego) videojuegoAComparar;
            if (horasEstimadas >=  videojuego.getHorasEstimadas())
                return HORAS_MAYOR;
            else
                return HORAS_MENOR;
        }
        return NO_INSTANCIA;
    }

}

