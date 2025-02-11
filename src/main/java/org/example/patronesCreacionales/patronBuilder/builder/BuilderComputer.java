package org.example.patronesCreacionales.patronBuilder.builder;

import org.example.patronesCreacionales.patronBuilder.modelo.Computer;

public interface BuilderComputer {
    public Computer getResult();
    public BuilderComputer procesador(String procesador);
    public BuilderComputer memoriaRam(String memoriaRam);
    public BuilderComputer almacenamiento(String almacenamiento);
    public BuilderComputer tarjetaGrafica(String tarjetaGrafica);
    public BuilderComputer sistemaOperativo(String sistemaOperativo);
}
