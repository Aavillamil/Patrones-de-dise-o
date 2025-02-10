package org.example.patronesCreacionales.patronAbastractFactory.abstractFactory;

import org.example.patronesCreacionales.patronAbastractFactory.services.Mesas;
import org.example.patronesCreacionales.patronAbastractFactory.services.Sillas;
import org.example.patronesCreacionales.patronAbastractFactory.services.Sofas;

public interface FabricaMuebles {
    public Sillas createSilla();

    public Mesas createMesas();

    public Sofas createSofas();

}
