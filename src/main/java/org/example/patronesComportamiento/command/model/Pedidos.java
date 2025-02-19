package org.example.patronesComportamiento.command.model;

import java.util.Date;
import java.util.List;

public class Pedidos {
    private Integer idPedido;
    private Date fechaPedido;
    private String estado;

    public Pedidos(Integer idPedido, Date fechaPedido, String estado) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "idPedido=" + idPedido +
                ", fechaPedido=" + fechaPedido +
                ", estado='" + estado + '\'' +
                '}';
    }
}
