package org.example.patronesCreacionales.patronBuilder.builder;

import org.example.patronesCreacionales.patronBuilder.modelo.Computer;
import org.example.patronesCreacionales.patronBuilder.modelo.ComputerGamming;

public class GammingComputerBuilder implements BuilderComputer{
    private String procesador;
    private String memoriaRam;
    private String almacenamiento;
    private String tarjetaGrafica;
    private String sistemaOperativo; @Override
    public BuilderComputer procesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    @Override
    public BuilderComputer memoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    @Override
    public BuilderComputer almacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    @Override
    public BuilderComputer tarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    @Override
    public BuilderComputer sistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;

    }
    @Override
    public Computer getResult() {
        return new ComputerGamming(procesador,memoriaRam,almacenamiento,tarjetaGrafica,sistemaOperativo);
    }
}
