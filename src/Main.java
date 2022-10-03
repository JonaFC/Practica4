import Builder.Builder;
import Builder.NaveBuilder;
import Nave.Nave;
import Nave.ComponentesNave.Arma.LaserDestructor;
import Nave.ComponentesNave.Blindaje.BlindajeFortaleza;
import Nave.ComponentesNave.Cabina.CabinaEjercito;
import Nave.ComponentesNave.Propulsion.ViajeIntergalactico;

public class Main {
    public static void main(String[] args) {
        Builder b = new NaveBuilder();
        b.addComponent(new ViajeIntergalactico());
        b.addComponent(new BlindajeFortaleza());
        b.addComponent(new CabinaEjercito());
        b.addComponent(new LaserDestructor());
        Nave nave = b.build();
        nave.mostrarNave();
    }
}