package Nave.ComponentesNave.Arma;

public class MisilesDePlasma extends Arma {
    @Override
    public String nombre() {
        return "Misiles de Plasma.";
    }

    @Override
    public String description() {
        return "Puede dañar una nave con blindaje reforzado ";
    }

    @Override
    public double precio() {
        return 300000.;
    }

}