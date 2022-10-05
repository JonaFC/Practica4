package Nave.ComponentesNave.Blindaje;

public class BlindajeSimple extends Blindaje {
    @Override
    public String nombre() {
        return "Blindaje Simple.";
    }

    @Override
    public String description() {
        return "Solo resiste ataques de láser simple.";
    }

    @Override
    public double precio() {
        return 5000.;
    }
}