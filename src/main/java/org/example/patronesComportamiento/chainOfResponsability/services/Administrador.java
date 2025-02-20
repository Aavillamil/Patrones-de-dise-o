package org.example.patronesComportamiento.chainOfResponsability.services;

import org.example.patronesComportamiento.chainOfResponsability.model.Tickets;
import org.example.patronesComportamiento.chainOfResponsability.responsability.GestionTickets;

public class Administrador extends GestionTickets {


    @Override
    public void procesarTickets(Tickets tickets) {
        System.out.println("Ticket solucionado por "+this.getClass().getSimpleName()+" por que el nivel del ticket es: "+tickets.getNivel());
    }
}
