package org.example.patronesComportamiento.chainOfResponsability.responsability;

import org.example.patronesComportamiento.chainOfResponsability.model.Tickets;

public abstract class GestionTickets  {
    protected GestionTickets next;

    public abstract void procesarTickets(Tickets tickets);


    public void setNext(GestionTickets t) {
         this.next=t;
    }
}
