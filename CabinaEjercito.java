public class CabinaEjercito extends Cabina{
    @Override
    public String nombre(){
        return "Ejercito.";
    }  

    @Override
    public String descripcion(){
        return "Caben hasta 50.";
    }

    @Override
    public double precio(){
        return 250000.;
    }
}