package Nave.ComponentesNave.Blindaje;

public class BlindajeFortaleza extends Blindaje {
    @Override
    public String nombre() {
        return "Blindaje Fortaleza.";
    }

    @Override
    public String description() {
        return "Resiste ataques de misiles de plasma.";
    }

    @Override
    public double precio() {
        return 50000.;
    }
}