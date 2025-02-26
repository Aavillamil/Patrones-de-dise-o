package org.example.patronesComportamiento;

import org.example.patronesComportamiento.mediator.mediatorFunction.ChatGrupo;
import org.example.patronesComportamiento.mediator.model.Usuarios;
import org.example.patronesComportamiento.mediator.services.UsuarioImpl;


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

        /*Invoker invoker = new Invoker();
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
        invoker.realizarAccionInterface();*/

        /*Tickets tickets= new Tickets("No me funciona el servidor", EnumNivelTicket.ALTO);
        SoporteBasico soporteBasico = new SoporteBasico();
        SoporteAvanzado soporteAvanzado = new SoporteAvanzado();
        Administrador administrador= new Administrador();

        soporteBasico.setNext(soporteAvanzado);
        soporteAvanzado.setNext(administrador);

        soporteBasico.procesarTickets(tickets);*/


        ChatGrupo chatGrupo = new ChatGrupo();
        Usuarios usuarios1 = new Usuarios(1,"Angel");
        Usuarios usuarios2 = new Usuarios(2,"Daniela");
        Usuarios usuarios3 = new Usuarios(2,"Juliana");
        UsuarioImpl usuarioImpl = new UsuarioImpl(chatGrupo,usuarios1);
        UsuarioImpl usuarioImpl2 = new UsuarioImpl(chatGrupo,usuarios2);
        UsuarioImpl usuarioImpl3 = new UsuarioImpl(chatGrupo,usuarios3);

        usuarioImpl.enviarMensaje("Hola a todos!");
        usuarioImpl2.enviarMensaje("Hola soy "+usuarios2.getNombre());
        usuarioImpl3.enviarMensaje("Hola soy "+usuarios3.getNombre());
        //chatGrupo.send(usuario1);





    }
}
