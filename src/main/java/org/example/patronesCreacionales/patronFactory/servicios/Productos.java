package org.example.patronesCreacionales.patronFactory.servicios;

public abstract class  Productos {
    public abstract double calcularPrecioFinal(double precio);
    public double descuentoOImpuesto(double precio, double porcentaje) {
        if(porcentaje == 0 || precio==0){
            System.out.println("No se puede calcular por que alguno de los valores son 0");
        }
        double porcentajeReal=porcentaje / 100;
        return precio * porcentajeReal;
    }

}
