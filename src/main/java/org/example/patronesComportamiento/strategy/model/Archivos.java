package org.example.patronesComportamiento.strategy.model;

public class Archivos {
    private String nombreArchivo;
    private double pesoArchivo;

    public Archivos() {
    }

    public Archivos(double pesoArchivo, String nombreArchivo) {
        this.pesoArchivo = pesoArchivo;
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public double getPesoArchivo() {
        return pesoArchivo;
    }

    public void setPesoArchivo(double pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }
}
