package org.example.patronAbastractFactory.abstractFactory;

import org.example.patronAbastractFactory.services.Mesas;
import org.example.patronAbastractFactory.services.Sillas;
import org.example.patronAbastractFactory.services.Sofas;

public interface FabricaMuebles {
    public Sillas createSilla();

    public Mesas createMesas();

    public Sofas createSofas();

}
