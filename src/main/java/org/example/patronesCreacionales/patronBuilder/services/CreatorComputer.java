package org.example.patronesCreacionales.patronBuilder.services;

import org.example.patronesCreacionales.patronBuilder.builder.BuilderComputer;

public class CreatorComputer {
    public void makeGamming(BuilderComputer builderComputer){
        builderComputer.procesador("Intel core i10");
        builderComputer.memoriaRam("64Gb");
        builderComputer.almacenamiento("2Tb");
        builderComputer.tarjetaGrafica("RGX 360");
        builderComputer.sistemaOperativo("Linux");
    }
    public void makeEstandar(BuilderComputer builderComputer){
        builderComputer.procesador("Intel core i5");
        builderComputer.memoriaRam("8gb");
        builderComputer.almacenamiento("500Gb");
        builderComputer.sistemaOperativo("Windows");
    }


}
