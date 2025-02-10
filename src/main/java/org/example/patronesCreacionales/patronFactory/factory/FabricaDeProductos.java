package org.example.patronesCreacionales.patronFactory.factory;

import org.example.patronesCreacionales.patronFactory.servicios.Electronicos;
import org.example.patronesCreacionales.patronFactory.servicios.Libros;
import org.example.patronesCreacionales.patronFactory.servicios.Productos;
import org.example.patronesCreacionales.patronFactory.servicios.Ropa;

public abstract class FabricaDeProductos {

    public abstract Productos crearProducto();

    public static Productos traerMetodo(String type){
        if(type.toUpperCase().equals("ROPA")){
            return new Ropa();
        } else if (type.toUpperCase().equals("ELECTRONICO")) {
            return new Electronicos();
        } else if (type.toUpperCase().equals("LIBRO")) {
            return new Libros();
        }else {
            throw new RuntimeException("NO EXISTE");
        }
    }
}
