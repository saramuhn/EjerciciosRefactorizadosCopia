package com.ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatoFecha {
    private Date fecha;
    private String fechaCambiada;

    public FormatoFecha() {
        obtenerFecha();
        cambiarFormatoFecha();
        mostrarFecha();
    }

    public void cambiarFormatoFecha() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        fechaCambiada = formatoFecha.format(fecha);
    }

    public void obtenerFecha() {
        fecha = new Date(Calendar.getInstance().getTimeInMillis());
    }

    public void mostrarFecha() {
        System.out.println("Fecha: " + fechaCambiada);
    }

}
