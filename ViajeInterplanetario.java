public class ViajeInterplanetario extends SistemaDePropulsion{
    @Override
    public String nombre(){
        return "Viaje intercontinental.";
    }  

    @Override
    public String descripcion(){
        return "Te permite hacer viajes de hasta medio año luz de distancia.";
    }

    @Override
    public double precio(){
        return 50000.;
    }
}