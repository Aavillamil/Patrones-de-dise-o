package org.example.patronesCreacionales.patronFactory.servicios;

public class Libros extends Productos{
    @Override
    public double calcularPrecioFinal(double precio) {
        return precio - super.descuentoOImpuesto(precio,5);
    }



}
