package org.example.patronesComportamiento.strategy;

import org.example.patronesComportamiento.strategy.context.ContextArchivos;
import org.example.patronesComportamiento.strategy.model.Archivos;
import org.example.patronesComportamiento.strategy.services.RarImpl;
import org.example.patronesComportamiento.strategy.services.ZipImpl;

public class MainComportamiento {
    public static void main(String[] args) {
        ContextArchivos archivos = new ContextArchivos(new RarImpl());
        Archivos rar=archivos.crearArchivo("Prueba 1",20.0);
        System.out.println(archivos.desComprimirArchivo(rar));
        System.out.println(archivos.comprimirArchivo(rar));

        ContextArchivos archivos2 = new ContextArchivos(new ZipImpl());
        Archivos zip=archivos2.crearArchivo("Prueba 2",20.0);
        System.out.println(archivos2.desComprimirArchivo(zip));
        System.out.println(archivos2.comprimirArchivo(zip));
    }
}
