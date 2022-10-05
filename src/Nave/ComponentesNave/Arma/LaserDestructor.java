package Nave.ComponentesNave.Arma;

public class LaserDestructor extends Arma {
    @Override
    public String nombre() {
        return "Láser Destructor de Planetas.";
    }

    @Override
    public String description() {
        return "Puede acabar con un planeta.";
    }

    @Override
    public double precio() {
        return 1000000.;
    }
}