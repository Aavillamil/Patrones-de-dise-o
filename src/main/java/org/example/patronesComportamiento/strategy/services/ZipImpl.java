package org.example.patronesComportamiento.strategy.services;

import org.example.patronesComportamiento.strategy.model.Archivos;

public class ZipImpl implements ArchivosService {
    @Override
    public Archivos crearArchivo(String nombreArchivo,double peso) {
        return new Archivos(peso,nombreArchivo);
    }

    @Override
    public String comprimirArchivo(Archivos archivos) {
        return "Se comprimio el archivo "+archivos.getNombreArchivo();
    }

    @Override
    public String descomprimirArchivo(Archivos archivos) {
        return "Se descomprimio el archivo "+archivos.getNombreArchivo();
    }
}
