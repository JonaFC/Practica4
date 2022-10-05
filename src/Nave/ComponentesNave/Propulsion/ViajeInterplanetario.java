package Nave.ComponentesNave.Propulsion;

public class ViajeInterplanetario extends SistemaDePropulsion {

    @Override
    public String nombre() {
        return "Viaje Interplanetario.";
    }

    @Override
    public String description() {
        return "Te permite hacer viajes de hasta medio año luz de distancia.";
    }

    @Override
    public double precio() {
        return 50000.;
    }

}