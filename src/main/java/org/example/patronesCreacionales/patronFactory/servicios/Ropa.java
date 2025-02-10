package org.example.patronesCreacionales.patronFactory.servicios;

public class Ropa extends Productos{
    @Override
    public double calcularPrecioFinal(double precio) {
        return (precio + super.descuentoOImpuesto(precio,10)-super.descuentoOImpuesto(precio,10));
    }
}
