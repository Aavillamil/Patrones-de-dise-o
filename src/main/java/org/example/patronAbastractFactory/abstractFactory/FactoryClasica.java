package org.example.patronAbastractFactory.abstractFactory;

import org.example.patronAbastractFactory.services.*;

public class FactoryClasica implements FabricaMuebles {
    @Override
    public Sillas createSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesas createMesas() {
        return new MesaClasica();
    }

    @Override
    public Sofas createSofas() {
        return new SofaClasico();
    }
}
