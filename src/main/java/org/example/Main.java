package org.example;

import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FabricaMuebles;
import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FactoryClasica;
import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FactoyModerno;

public class Main {
    public static void main(String[] args) {
        FabricaMuebles mueblesClasicos= new FactoryClasica();
        FabricaMuebles mueblesModernos= new FactoyModerno();
        //clasicos
        System.out.println(mueblesClasicos.createSilla().mostrarDiseño());
        System.out.println(mueblesClasicos.createMesas().mostrarDiseño());
        System.out.println(mueblesClasicos.createSofas().mostrarDiseño());
        //modernos
        System.out.println(mueblesModernos.createSilla().mostrarDiseño());
        System.out.println(mueblesModernos.createMesas().mostrarDiseño());
        System.out.println(mueblesModernos.createSofas().mostrarDiseño());


//        Productos libro = FabricaDeProductos.traerMetodo("libro");
//        double precioLibro = libro.calcularPrecioFinal(100);
//        System.out.println("Creando un libro de precio base de: 500");
//        System.out.println("Precio final del libro es: "+precioLibro);
//
//
//        Productos electronico = FabricaDeProductos.traerMetodo("Electronico");
//        double precioElectronico = electronico.calcularPrecioFinal(500);
//        System.out.println("Creando un electronico de precio base de: 500");
//        System.out.println("Precio final del electronico es: "+precioElectronico);
//
//        Productos ropa=FabricaDeProductos.traerMetodo("Ropa");
//        double precioRopa=ropa.calcularPrecioFinal(200);
//        System.out.println("Creando una ropa de precio base de: 200");
//        System.out.println("Precio final de la ropa es: "+precioRopa);


    }

}