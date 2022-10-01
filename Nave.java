import java.util.LinkedList;
public class Nave{
    private LinkedList<ComponenteNave> componentesNave = new LinkedList<ComponenteNave>();

    public void agregarComponente(ComponenteNave componenteNave){
        componentesNave.add(componenteNave);
    }

    public double costoNave(){
        double costo = 0.;

        for(ComponenteNave componenteNave : componentesNave){
            costo += componenteNave.precio();
        }
        return costo;
    }

    public void mostrarNave(){
        for(ComponenteNave componenteNave : componentesNave){
            System.out.print("Componente : " + componenteNave.nombre());
            System.out.println("... Precio: €" + componenteNave.precio());
        }
    }


}