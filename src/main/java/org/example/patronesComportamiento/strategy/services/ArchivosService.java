package org.example.patronesComportamiento.strategy.services;

import org.example.patronesComportamiento.strategy.model.Archivos;

public interface ArchivosService {

    Archivos crearArchivo(String archivos, double peso);

    String comprimirArchivo(Archivos archivos);

    String descomprimirArchivo(Archivos archivos);
}
