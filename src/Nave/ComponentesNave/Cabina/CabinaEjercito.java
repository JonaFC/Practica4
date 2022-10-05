package Nave.ComponentesNave.Cabina;

public class CabinaEjercito extends Cabina {

    @Override
    public String nombre() {
        return "Ejército.";
    }

    @Override
    public String description() {
        return "Caben hasta 50.";
    }

    @Override
    public double precio() {
        return 250000.;
    }
}