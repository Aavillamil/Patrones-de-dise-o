package org.example.patronesComportamiento.chainOfResponsability.model;

public class Tickets {
    private String problema;
    private EnumNivelTicket nivel;

    public Tickets(String problema, EnumNivelTicket nivel) {
        this.problema = problema;
        this.nivel = nivel;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public EnumNivelTicket getNivel() {
        return nivel;
    }

    public void setNivel(EnumNivelTicket nivel) {
        this.nivel = nivel;
    }
}
