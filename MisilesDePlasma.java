public class MisilesDePlasma extends Arma{
    @Override
    public String nombre(){
        return "Misiles de plasma.";
    }  

    @Override
    public String descripcion(){
        return "Puede dañar una nave con blindaje reforzado ";
    }

    @Override
    public double precio(){
        return 300000.;
    }
}