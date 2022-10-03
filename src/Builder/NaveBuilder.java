package Builder;

import Nave.Nave;
import Nave.ComponentesNave.ComponenteNave;

public class NaveBuilder extends Builder {

    @Override
    public Builder addComponent(ComponenteNave component) {
        componentes.add(component);
        return this;
    }

    @Override
    public Nave build() {
        return new Nave(this);
    }

}