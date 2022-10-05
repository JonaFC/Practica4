package Nave;

import Builder.Builder;
import Nave.ComponentesNave.ComponenteNave;

import java.util.LinkedList;
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

    public String mostrarNave() {

        StringBuilder mostraNaveString = new StringBuilder("\n");
        for (ComponenteNave componente : componentes) {
            mostraNaveString.append("Componente: ").append(componente.nombre()).append(" - Descripción: ").append(componente.description()).append(" - Costo: €").append(componente.precio()).append("\n");
        }
        return mostraNaveString.toString();
    }

    public LinkedList<ComponenteNave> getComponentes() {
        return componentes;
    }

}