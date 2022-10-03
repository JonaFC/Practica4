package Nave;

import java.util.LinkedList;

import Builder.Builder;
import Nave.ComponentesNave.ComponenteNave;

public class Nave {
    private LinkedList<ComponenteNave> componentes;

    public Nave(Builder builder) {
        this.componentes = builder.getComponentes();
    }

    public double costoNave() {
        double costo = 0.;

        for (ComponenteNave componente : componentes) {
            costo += componente.precio();
        }
        return costo;
    }

    public void mostrarNave() {

        for (ComponenteNave componente : componentes) {
            System.out.print("Componente : " + componente.nombre());
            System.out.println("... Precio: €" + componente.precio());
        }
    }

    public LinkedList<ComponenteNave> getComponentes() {
        return componentes;
    }
}