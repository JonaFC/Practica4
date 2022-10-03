package Nave.ComponentesNave.Blindaje;

public class BlindajeReforzado extends Blindaje {
    @Override
    public String nombre() {
        return "Blindaje reforzado.";
    }

    @Override
    public String descripcion() {
        return "Resiste ataques de láser simple y 1 misil de plasma.";
    }

    @Override
    public double precio() {
        return 15000.;
    }
}