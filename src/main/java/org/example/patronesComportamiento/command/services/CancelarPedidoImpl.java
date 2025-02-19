package org.example.patronesComportamiento.command.services;

import org.example.patronesComportamiento.command.model.Pedidos;

public class CancelarPedidoImpl implements Command{
    private final PedidoService pedidoService;
    private final Pedidos pedidos;

    public CancelarPedidoImpl(PedidoService pedidoService, Pedidos pedidos) {
        this.pedidoService = pedidoService;
        this.pedidos = pedidos;
    }

    @Override
    public void execute() {
        pedidoService.cancelarPedido(this.pedidos);
    }
}
