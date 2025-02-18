package org.example.patronesComportamiento.observer.services;

public class AplicacionesMoviles implements Listeners{


    @Override
    public void update(String mensaje) {
        System.out.println("Entre a aplicaciones moviles para notificar y "+mensaje);
    }
}
