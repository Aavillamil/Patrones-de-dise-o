package org.example.patronesCreacionales.patronPrototype;

import java.util.Objects;

public abstract class Vehiculos {
    private String marca;
    private String modelo;
    private Integer anio;
    private Double kilometraje;

    public Vehiculos() {
    }

    public Vehiculos(Vehiculos vehiculos) {
        if(vehiculos != null){
            this.marca = vehiculos.marca;
            this.modelo = vehiculos.modelo;
            this.anio = vehiculos.anio;
            this.kilometraje = vehiculos.kilometraje;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }
    public abstract Vehiculos clone();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Vehiculos vehiculos)) return false;
        return Objects.equals(marca, vehiculos.marca) && Objects.equals(modelo, vehiculos.modelo) && Objects.equals(anio, vehiculos.anio) && Objects.equals(kilometraje, vehiculos.kilometraje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio, kilometraje);
    }
}
