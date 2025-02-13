package org.example.patronesCreacionales.patronPrototype;

import java.util.Objects;

public class Camiones extends Vehiculos{
    private String capacidad_carga;

    public Camiones(){

    }



    public Camiones(Camiones camiones) {
        super(camiones);
        if(camiones != null){
            this.capacidad_carga = camiones.capacidad_carga;
        }
    }
    public String getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(String capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }
    @Override
    public Vehiculos clone() {
        return new Camiones(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Camiones camiones)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(capacidad_carga, camiones.capacidad_carga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacidad_carga);
    }
}
