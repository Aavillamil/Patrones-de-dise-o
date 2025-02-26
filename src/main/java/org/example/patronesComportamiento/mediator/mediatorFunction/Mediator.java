package org.example.patronesComportamiento.mediator.mediatorFunction;

import org.example.patronesComportamiento.mediator.model.Usuarios;
import org.example.patronesComportamiento.mediator.services.UsuariosService;

public interface Mediator {
    public void add(UsuariosService usuarios);
    public void send(UsuariosService usuariosService,String mensaje,Usuarios usuarios);
}
