package org.example;

import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FabricaMuebles;
import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FactoryClasica;
import org.example.patronesCreacionales.patronAbastractFactory.abstractFactory.FactoyModerno;
import org.example.patronesCreacionales.patronBuilder.builder.EstandarComputerBuilder;
import org.example.patronesCreacionales.patronBuilder.builder.GammingComputerBuilder;
import org.example.patronesCreacionales.patronBuilder.modelo.ComputerEstandar;
import org.example.patronesCreacionales.patronBuilder.modelo.ComputerGamming;
import org.example.patronesCreacionales.patronBuilder.services.CreatorComputer;
import org.example.patronesCreacionales.patronPrototype.Camiones;
import org.example.patronesCreacionales.patronPrototype.Vehiculos;

public class Main {
    public static void main(String[] args) {
        //PROTOTYPE
        Camiones camion = new Camiones();
        camion.setModelo("3");
        camion.setMarca("Volvo");
        camion.setAnio(2024);
        camion.setKilometraje(20.000);
        camion.setCapacidad_carga("2");
        Camiones camion2= (Camiones) camion.clone();

        System.out.println(camion.getAnio());
        System.out.println(camion2.getCapacidad_carga());




        /*
        //BUILDER
        CreatorComputer creatorComputer = new CreatorComputer();

        //estandar
        EstandarComputerBuilder estandarComputerBuilder= new EstandarComputerBuilder();
        creatorComputer.makeEstandar(estandarComputerBuilder);
        ComputerEstandar computerEstandar = (ComputerEstandar) estandarComputerBuilder.getResult();
        System.out.println(computerEstandar.encenderEquipo());
        System.out.println(computerEstandar.getProcesador());
        System.out.println(computerEstandar.getAlmacenamiento());
        System.out.println(computerEstandar.getMemoriaRam());
        System.out.println(computerEstandar.getSistemaOperativo());
        System.out.println(computerEstandar.apagarEquipo());
        //Gamming
        GammingComputerBuilder gammingComputerBuilder= new GammingComputerBuilder();
        creatorComputer.makeGamming(gammingComputerBuilder);
        ComputerGamming computerGamming = (ComputerGamming) gammingComputerBuilder.getResult();
        System.out.println(computerGamming.encenderEquipo());
        System.out.println(computerGamming.getProcesador());
        System.out.println(computerGamming.getAlmacenamiento());
        System.out.println(computerGamming.getMemoriaRam());
        System.out.println(computerGamming.getSistemaOperativo());
        System.out.println(computerGamming.apagarEquipo());*/

        /*
        //ABSTRACT FACTORY

        FabricaMuebles mueblesClasicos= new FactoryClasica();
        FabricaMuebles mueblesModernos= new FactoyModerno();
        //clasicos
        System.out.println(mueblesClasicos.createSilla().mostrarDiseño());
        System.out.println(mueblesClasicos.createMesas().mostrarDiseño());
        System.out.println(mueblesClasicos.createSofas().mostrarDiseño());
        //modernos
        System.out.println(mueblesModernos.createSilla().mostrarDiseño());
        System.out.println(mueblesModernos.createMesas().mostrarDiseño());
        System.out.println(mueblesModernos.createSofas().mostrarDiseño());*/


       /*
       //FACTORY
       Productos libro = FabricaDeProductos.traerMetodo("libro");
        double precioLibro = libro.calcularPrecioFinal(100);
        System.out.println("Creando un libro de precio base de: 500");
        System.out.println("Precio final del libro es: "+precioLibro);


        Productos electronico = FabricaDeProductos.traerMetodo("Electronico");
        double precioElectronico = electronico.calcularPrecioFinal(500);
        System.out.println("Creando un electronico de precio base de: 500");
        System.out.println("Precio final del electronico es: "+precioElectronico);

        Productos ropa=FabricaDeProductos.traerMetodo("Ropa");
        double precioRopa=ropa.calcularPrecioFinal(200);
        System.out.println("Creando una ropa de precio base de: 200");
        System.out.println("Precio final de la ropa es: "+precioRopa);*/


    }

}