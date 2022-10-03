package Builder;

import java.util.LinkedList;

import Nave.Nave;
import Nave.ComponentesNave.ComponenteNave;

public abstract class Builder {
    protected LinkedList<ComponenteNave> componentes = new LinkedList<ComponenteNave>();

    public abstract Builder addComponent(ComponenteNave component);

    public abstract Nave build();

    public LinkedList<ComponenteNave> getComponentes() {
        return componentes;
    }

}
