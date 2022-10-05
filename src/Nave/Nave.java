package Nave;

import Builder.Builder;
import Nave.ComponentesNave.ComponenteNave;

import java.util.LinkedList;

public class Nave {
    private LinkedList<ComponenteNave> componentes;

    public Nave(Builder builder) {
        this.componentes = builder.getComponentes();
    }

    /**
     * Regresa el costo total de la nave.
     * 
     * @return double Costo total.
     */
    public double costoNave() {

        double costo = 0.;
        for (ComponenteNave componente : componentes) {
            costo += componente.precio();
        }
        return costo;
    }

    /**
     * Regresa descripcion detallada de la nave.
     * 
     * @return String Descripcion de la nave construida.
     */
    public String mostrarNave() {

        StringBuilder mostraNaveString = new StringBuilder("\n");
        for (ComponenteNave componente : componentes) {
            mostraNaveString.append("Componente: ").append(componente.nombre()).append(" - Descripción: ")
                    .append(componente.description()).append(" - Costo: €").append(componente.precio()).append("\n");
        }
        return mostraNaveString.toString();
    }

    /**
     * Regresa los componentes de la nave.
     * 
     * @return LinkedList<ComponenteNave> Componentes de la clase Nave.
     */
    public LinkedList<ComponenteNave> getComponentes() {
        return componentes;
    }

}