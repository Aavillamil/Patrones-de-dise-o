package org.example.patronesCreacionales.patronAbastractFactory.services;

public class MesaClasica implements Mesas{
    @Override
    public String mostrarDiseño() {
        return "MESA:Mesa de madera maciza, tallados, bordes redondeados.";
    }
}
