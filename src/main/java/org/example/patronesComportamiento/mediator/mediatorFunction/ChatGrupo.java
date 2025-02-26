package org.example.patronesComportamiento.mediator.mediatorFunction;

import org.example.patronesComportamiento.mediator.model.Usuarios;
import org.example.patronesComportamiento.mediator.services.UsuariosService;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupo implements Mediator {
    private List<UsuariosService> listUsuarios= new ArrayList<>();

    @Override
    public void add(UsuariosService usuarios) {
        listUsuarios.add(usuarios);
    }

    @Override
    public void send(UsuariosService usuariosService,String mensaje,Usuarios usuarios) {
        for(UsuariosService u:listUsuarios){
            if(u != usuariosService){
                u.recibirMensaje(mensaje,usuarios);
            }
        }
    }
}
