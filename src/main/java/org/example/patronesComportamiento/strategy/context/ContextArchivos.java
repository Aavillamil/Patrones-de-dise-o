package org.example.patronesComportamiento.strategy.context;

import org.example.patronesComportamiento.strategy.model.Archivos;
import org.example.patronesComportamiento.strategy.services.ArchivosService;

public class ContextArchivos {
    private ArchivosService archivosService;

    public ContextArchivos(ArchivosService archivosService) {
        this.archivosService = archivosService;
    }

    public void traerArchivo(ArchivosService archivosService){
        this.archivosService=archivosService;
    }

    public Archivos crearArchivo(String nombreArchivo, double peso){
        return archivosService.crearArchivo(nombreArchivo,peso);
    }

    public String comprimirArchivo(Archivos archivos){
        return archivosService.comprimirArchivo(archivos);
    }

    public String desComprimirArchivo(Archivos archivos){
        return archivosService.descomprimirArchivo(archivos);
    }

}
