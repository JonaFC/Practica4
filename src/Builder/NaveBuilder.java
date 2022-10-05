package Builder;

import Nave.Nave;
import Nave.ComponentesNave.ComponenteNave;

public class NaveBuilder extends Builder {

    /**
     * Agrega un componente a la lista de componentes.
     * 
     * @param component Componente que se desea agregar.
     * @return Builder Se regresa el constructor.
     */
    @Override
    public Builder addComponent(ComponenteNave component) {
        componentes.add(component);
        return this;
    }

    /**
     * Construye la nave.
     * 
     * @return Nave Regresa la nave construida.
     */
    @Override
    public Nave build() {
        return new Nave(this);
    }

}