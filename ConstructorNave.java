public class ConstructorNave{
    public static void main(String[] args){

        Nave nuevaNave = new Nave();
        nuevaNave.agregarComponente( new ViajeIntergalactico());
        nuevaNave.agregarComponente( new BlindajeFortaleza());
        nuevaNave.agregarComponente( new CabinaEjercito());
        nuevaNave.agregarComponente( new LaserDestructor());
        System.out.println(nuevaNave.costoNave());
        nuevaNave.mostrarNave();

    }
    

}