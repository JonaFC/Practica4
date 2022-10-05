package Nave.ComponentesNave.Propulsion;

public class ViajeIntergalactico extends SistemaDePropulsion {
    @Override
    public String nombre() {
        return "Viaje Intergalactico.";
    }

    @Override
    public String description() {
        return "Te permite hacer viajes de hasta 15 años luz de distancia.";
    }

    @Override
    public double precio() {
        return 100000.;
    }
}