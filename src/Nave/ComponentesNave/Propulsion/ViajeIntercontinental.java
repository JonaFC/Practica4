package Nave.ComponentesNave.Propulsion;

public class ViajeIntercontinental extends SistemaDePropulsion {
    @Override
    public String nombre() {
        return "Viaje intercontinental.";
    }

    @Override
    public String descripcion() {
        return "Te permite hacer viajes no tan largos.";
    }

    @Override
    public double precio() {
        return 20000.;
    }
}