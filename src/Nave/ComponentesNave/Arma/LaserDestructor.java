package Nave.ComponentesNave.Arma;

public class LaserDestructor extends Arma {
    @Override
    public String nombre() {
        return "Láser destructor de planetas.";
    }

    @Override
    public String descripcion() {
        return "Puede acabar con un planeta.";
    }

    @Override
    public double precio() {
        return 1000000.;
    }
}