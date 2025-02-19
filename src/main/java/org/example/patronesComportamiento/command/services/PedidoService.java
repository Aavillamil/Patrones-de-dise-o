package org.example.patronesComportamiento.command.services;

import org.example.patronesComportamiento.command.model.Pedidos;
import org.example.patronesComportamiento.command.model.Productos;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoService {
    private Map<Pedidos,List<Productos>> pedidosProductosMap=new HashMap<>();
    private List<Productos> listProductos;

    public void agregarProducto(Pedidos pedidos,Productos productos) {
        pedidosProductosMap.putIfAbsent(pedidos,new ArrayList<>());
        pedidosProductosMap.get(pedidos).add(productos);
        System.out.println("Se agrego el producto exitosamente");
    }

    public void cancelarPedido(Pedidos pedidos) {
        pedidosProductosMap.remove(pedidos);
        System.out.println("Se cancelo el pedido exitosamente");

    }

    public void completarPedido(Pedidos pedidos) {
        if (pedidosProductosMap.containsKey(pedidos)) {
            pedidos.setEstado("Completado");
            System.out.println("Pedido Completado!");
        } else {
            System.out.println("Error: No se encontró el pedido.");
        }
    }
    public void recorrerHash(){
        for(Map.Entry<Pedidos, List<Productos>> valores :pedidosProductosMap.entrySet()){
            System.out.println("Key: " + valores.getKey().toString() +
                    "\n valor:"+ valores.getValue());
        }
    }


}
