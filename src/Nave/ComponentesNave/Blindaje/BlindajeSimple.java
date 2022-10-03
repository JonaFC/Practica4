package Nave.ComponentesNave.Blindaje;

public class BlindajeSimple extends Blindaje {
    @Override
    public String nombre() {
        return "Blindaje simple.";
    }

    @Override
    public String descripcion() {
        return "Solo resiste ataques de láser simple.";
    }

    @Override
    public double precio() {
        return 5000.;
    }
}