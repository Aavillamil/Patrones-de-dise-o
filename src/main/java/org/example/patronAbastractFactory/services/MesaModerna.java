package org.example.patronAbastractFactory.services;

public class MesaModerna implements Mesas{
    @Override
    public String mostrarDiseño() {
        return "MESA:Mesa de vidrio, patas de metal, bordes rectos.";
    }
}
