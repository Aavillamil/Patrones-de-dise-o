package org.example.patronAbastractFactory.abstractFactory;

import org.example.patronAbastractFactory.services.*;

public class FactoyModerno implements FabricaMuebles{
    @Override
    public Sillas createSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesas createMesas() {
        return new MesaModerna();
    }

    @Override
    public Sofas createSofas() {
        return new SofaModerno();
    }
}
