package Builder;

import java.util.LinkedList;

import Nave.Nave;
import Nave.ComponentesNave.ComponenteNave;

/**
 * Patrón de Diseño Builder
 */
public abstract class Builder {
    protected LinkedList<ComponenteNave> componentes = new LinkedList<ComponenteNave>();

    /**
     * Agrega un componente a la lista de componentes.
     * 
     * @param component Componente que se desea agregar.
     * @return Builder Se regresa el constructor.
     */
    public abstract Builder addComponent(ComponenteNave component);

    /**
     * Construye la nave.
     * 
     * @return Nave Regresa la nave construida.
     */
    public abstract Nave build();

    /**
     * Construye la nave.
     * 
     * @return LinkedList<ComponenteNave> Regresa la lista de componentes.
     */
    public LinkedList<ComponenteNave> getComponentes() {
        return componentes;
    }

}
