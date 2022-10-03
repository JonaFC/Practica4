package Nave.ComponentesNave.Arma;

public class LaserSimple extends Arma {
    @Override
    public String nombre() {
        return "Láser simple.";
    }

    @Override
    public String descripcion() {
        return "Puede matar a 1 persona.";
    }

    @Override
    public double precio() {
        return 25000.;
    }
}