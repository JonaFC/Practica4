public class ViajeIntergalactico extends SistemaDePropulsion{
    @Override
    public String nombre(){
        return "Viaje intercontinental.";
    }  

    @Override
    public String descripcion(){
        return "Te permite hacer viajes de hasta 15 años luz de distancia.";
    }

    @Override
    public double precio(){
        return 100000.;
    }
}