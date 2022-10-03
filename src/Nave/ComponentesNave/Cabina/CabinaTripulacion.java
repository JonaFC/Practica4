package Nave.ComponentesNave.Cabina;

public class CabinaTripulacion extends Cabina {
    @Override
    public String nombre() {
        return "Tripulacion Pequeña.";
    }

    @Override
    public String descripcion() {
        return "Caben hasta 10 personas.";
    }

    @Override
    public double precio() {
        return 40000.;
    }
}