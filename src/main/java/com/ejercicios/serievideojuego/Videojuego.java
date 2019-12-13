package
        com.ejercicios.serievideojuego;

public class Videojuego implements Entregable {
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
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
    public int compareTo(Object a) {
        if (a instanceof Videojuego) {
            Videojuego videojuego = (Videojuego) a;
            if (horasEstimadas >=  videojuego.getHorasEstimadas())
                return 1;
            else
                return 0;
        }
        return -1;
    }

}

