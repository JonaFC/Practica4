package Nave.ComponentesNave.Cabina;

public class CabinaPiloto extends Cabina {
    @Override
    public String nombre() {
        return "1 piloto.";
    }

    @Override
    public String description() {
        return "Solo cabe una persona.";
    }

    @Override
    public double precio() {
        return 5000.;
    }

}