public class CabinaPiloto extends Cabina{
    @Override
    public String nombre(){
        return "1 piloto.";
    }  

    @Override
    public String descripcion(){
        return "Solo cabe una persona.";
    }

    @Override
    public double precio(){
        return 5000.;
    }
}