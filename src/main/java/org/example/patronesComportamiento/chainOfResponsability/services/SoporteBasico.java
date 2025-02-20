package org.example.patronesComportamiento.chainOfResponsability.services;

import org.example.patronesComportamiento.chainOfResponsability.model.Tickets;
import org.example.patronesComportamiento.chainOfResponsability.responsability.GestionTickets;

import java.util.Objects;

public class SoporteBasico extends GestionTickets {


    @Override
    public void procesarTickets(Tickets tickets) {
        if (Objects.equals(tickets.getNivel(), "bajo")){
            System.out.println("Ticket solucionado por "+this.getClass().getSimpleName()+" por que el nivel del ticket es: "+tickets.getNivel());
        }else{
            super.next.procesarTickets(tickets);
        }
    }

}
