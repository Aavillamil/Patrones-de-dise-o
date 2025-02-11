package org.example.patronesCreacionales.patronBuilder.modelo;

public class ComputerEstandar extends Computer{


    public ComputerEstandar(String procesador, String memoriaRam, String almacenamiento, String tarjetaGrafica, String sistemaOperativo) {
        super(procesador, memoriaRam, almacenamiento, tarjetaGrafica, sistemaOperativo);
    }

    @Override
    public String getProcesador() {
        return super.getProcesador();
    }

    @Override
    public void setProcesador(String procesador) {
        super.setProcesador(procesador);
    }

    @Override
    public String getSistemaOperativo() {
        return super.getSistemaOperativo();
    }

    @Override
    public void setSistemaOperativo(String sistemaOperativo) {
        super.setSistemaOperativo(sistemaOperativo);
    }

    @Override
    public void setTarjetaGrafica(String tarjetaGrafica) {
        super.setTarjetaGrafica(tarjetaGrafica);
    }

    @Override
    public String getAlmacenamiento() {
        return super.getAlmacenamiento();
    }

    @Override
    public String getTarjetaGrafica() {
        return super.getTarjetaGrafica();
    }

    @Override
    public void setAlmacenamiento(String almacenamiento) {
        super.setAlmacenamiento(almacenamiento);
    }

    @Override
    public String getMemoriaRam() {
        return super.getMemoriaRam();
    }

    @Override
    public void setMemoriaRam(String memoriaRam) {
        super.setMemoriaRam(memoriaRam);
    }

    @Override
    public String encenderEquipo() {
        return "Estandar encendido";
    }

    @Override
    public String apagarEquipo() {
        return "Estandar apagado";
    }
}
