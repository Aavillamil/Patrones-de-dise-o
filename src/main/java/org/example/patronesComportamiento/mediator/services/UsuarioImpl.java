package org.example.patronesComportamiento.mediator.services;

import org.example.patronesComportamiento.mediator.mediatorFunction.Mediator;
import org.example.patronesComportamiento.mediator.model.Usuarios;

public class UsuarioImpl implements UsuariosService{
    private final Mediator mediator;
    private  final Usuarios usuarios;

    public UsuarioImpl(Mediator mediator, Usuarios usuarios) {
        this.mediator = mediator;
        this.usuarios = usuarios;
        mediator.add(this);
    }

    @Override
    public String enviarMensaje(String mensaje) {
        //System.out.println("Hola usuario 2");
        mediator.send(this,mensaje,usuarios);
        return mensaje;
    }

    @Override
    public void recibirMensaje(String mensaje,Usuarios usuarios) {
        System.out.println("Recibi el mensaje de :"+usuarios.getNombre());
        System.out.println(usuarios.getNombre()+": "+mensaje);
    }
}
