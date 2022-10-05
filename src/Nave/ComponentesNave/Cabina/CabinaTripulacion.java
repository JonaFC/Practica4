package Nave.ComponentesNave.Cabina;

public class CabinaTripulacion extends Cabina {
    @Override
    public String nombre() {
        return "Tripulación Pequeña.";
    }

    @Override
    public String description() {
        return "Caben hasta 10 personas.";
    }

    @Override
    public double precio() {
        return 40000.;
    }
}