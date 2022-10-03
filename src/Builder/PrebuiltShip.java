package Builder;

import Nave.Nave;
import Nave.ComponentesNave.Arma.*;
import Nave.ComponentesNave.Blindaje.*;
import Nave.ComponentesNave.Cabina.*;
import Nave.ComponentesNave.Propulsion.*;

public class PrebuiltShip {
    private Builder builder = new NaveBuilder();

    public Nave construct(int selection) throws Exception {
        if (selection > 3 || selection < 1) {
            throw new Exception();
        }

        switch (selection) {

            case 1:
                // Nave individual de combate.
                builder.addComponent(new ViajeIntergalactico());
                builder.addComponent(new BlindajeFortaleza());
                builder.addComponent(new CabinaPiloto());
                builder.addComponent(new LaserDestructor());
                break;
            case 2:
                // Nave militar de transporte.
                builder.addComponent(new CabinaEjercito());
                builder.addComponent(new LaserDestructor());
                builder.addComponent(new BlindajeFortaleza());
                builder.addComponent(new ViajeIntercontinental());
                break;
            case 3:
                // Base espacial de guerra.
                builder.addComponent(new ViajeIntergalactico());
                builder.addComponent(new MisilesDePlasma());
                builder.addComponent(new BlindajeReforzado());
                builder.addComponent(new CabinaTripulacion());
                break;
            default:
                System.err.print("Selecciona una opción válida.");
                break;
        }

        return builder.build();
    }

}
