package org.example.patronesCreacionales.patronAbastractFactory.abstractFactory;

import org.example.patronAbastractFactory.services.*;
import org.example.patronesCreacionales.patronAbastractFactory.services.*;

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
