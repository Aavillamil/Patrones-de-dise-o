package org.example.patronesComportamiento.command.services;

import org.example.patronesComportamiento.command.model.Pedidos;
import org.example.patronesComportamiento.command.model.Productos;

public class AgregarProductoImpl implements Command {
    private final PedidoService pedidoService;
    private final Productos productos;
    private final Pedidos pedidos;

    public AgregarProductoImpl(PedidoService pedidoService, Productos productos, Pedidos pedidos) {
        this.pedidoService = pedidoService;
        this.productos = productos;
        this.pedidos = pedidos;
    }

    @Override
    public void execute() {
         pedidoService.agregarProducto(this.pedidos,this.productos);
            pedidoService.recorrerHash();
    }


}
