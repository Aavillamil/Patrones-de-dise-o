package org.example.patronesComportamiento.mediator.services;

import org.example.patronesComportamiento.mediator.model.Usuarios;

public interface UsuariosService {

    public String enviarMensaje(String mensaje);
    public void recibirMensaje( String mensaje, Usuarios usuarios);
}
