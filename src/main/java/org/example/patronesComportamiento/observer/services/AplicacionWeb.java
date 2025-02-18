package org.example.patronesComportamiento.observer.services;

public class AplicacionWeb implements Listeners{
    @Override
    public void update(String mensaje) {
        System.out.println("Entre a aplicacion web y "+mensaje);
    }
}
