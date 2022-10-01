public class BlindajeFortaleza extends Blindaje{
    @Override
    public String nombre(){
        return "Blindaje fortaleza.";
    }  

    @Override
    public String descripcion(){
        return "Resiste ataques de misiles de plasma.";
    }

    @Override
    public double precio(){
        return 50000.;
    }
}