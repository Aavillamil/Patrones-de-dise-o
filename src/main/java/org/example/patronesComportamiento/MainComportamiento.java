package org.example.patronesComportamiento;

import org.example.patronesComportamiento.command.invoker.Invoker;
import org.example.patronesComportamiento.command.model.Pedidos;
import org.example.patronesComportamiento.command.model.Productos;
import org.example.patronesComportamiento.command.services.AgregarProductoImpl;
import org.example.patronesComportamiento.command.services.CancelarPedidoImpl;
import org.example.patronesComportamiento.command.services.CompletarPedido;
import org.example.patronesComportamiento.command.services.PedidoService;
import org.example.patronesComportamiento.observer.services.AplicacionWeb;
import org.example.patronesComportamiento.observer.services.AplicacionesMoviles;
import org.example.patronesComportamiento.observer.services.Publisher;
import org.example.patronesComportamiento.observer.services.ServidorNotificaciones;
import org.example.patronesComportamiento.strategy.context.ContextArchivos;
import org.example.patronesComportamiento.strategy.model.Archivos;
import org.example.patronesComportamiento.strategy.services.RarImpl;
import org.example.patronesComportamiento.strategy.services.ZipImpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainComportamiento {
    public static void main(String[] args) {
       /* ContextArchivos archivos = new ContextArchivos(new RarImpl());
        Archivos rar=archivos.crearArchivo("Prueba 1",20.0);
        System.out.println(archivos.desComprimirArchivo(rar));
        System.out.println(archivos.comprimirArchivo(rar));

        ContextArchivos archivos2 = new ContextArchivos(new ZipImpl());
        Archivos zip=archivos2.crearArchivo("Prueba 2",20.0);
        System.out.println(archivos2.desComprimirArchivo(zip));
        System.out.println(archivos2.comprimirArchivo(zip));*/

       /* Publisher publisher = new ServidorNotificaciones();
        publisher.addSubscriptor("Aplicacion movil",new AplicacionesMoviles());
        publisher.addSubscriptor("Aplicacion web",new AplicacionWeb());
        publisher.notifyMessages();*/

        Invoker invoker = new Invoker();
        Pedidos pedidos = new Pedidos(1, Date.valueOf(LocalDate.now()),"Abierto");
        Productos shampoo= new Productos("Shampoo",5000);
        Productos jabon= new Productos("Jabon",2000);

        PedidoService pedidoService = new PedidoService();
        AgregarProductoImpl agregarProducto=new AgregarProductoImpl(pedidoService,shampoo,pedidos);
        AgregarProductoImpl agregarProducto2=new AgregarProductoImpl(pedidoService,shampoo,pedidos);
        CompletarPedido completarPedido=new CompletarPedido(pedidoService,pedidos);
        CancelarPedidoImpl cancelarPedido = new CancelarPedidoImpl(pedidoService,pedidos);

        invoker.recibirInterface(agregarProducto);
        invoker.recibirInterface(agregarProducto2);
        invoker.recibirInterface(completarPedido);
        invoker.recibirInterface(cancelarPedido);
        invoker.realizarAccionInterface();



    }
}
