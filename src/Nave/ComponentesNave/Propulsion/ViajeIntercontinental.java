package Nave.ComponentesNave.Propulsion;

public class ViajeIntercontinental extends SistemaDePropulsion {
    @Override
    public String nombre() {
        return "Viaje Intercontinental.";
    }

    @Override
    public String description() {
        return "Te permite hacer viajes no tan largos.";
    }

    @Override
    public double precio() {
        return 20000.;
    }

}