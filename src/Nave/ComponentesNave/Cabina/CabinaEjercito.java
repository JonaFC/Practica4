package Nave.ComponentesNave.Cabina;

public class CabinaEjercito extends Cabina {

    /**
     * Regresa el nombre del componente.
     * 
     * @return String Nombre del componente.
     */
    @Override
    public String nombre() {
        return "Ejército.";
    }

    /**
     * Regresa el descripción del componente.
     * 
     * @return String Descripción del componente.
     */
    @Override
    public String description() {
        return "Caben hasta 50.";
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return double Precio del componente.
     */
    @Override
    public double precio() {
        return 250000.;
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return int Ataque del componente.
     */
    @Override
    public int atack() {
        return 12;
    }

    /**
     * Regresa el Defensa del componente.
     * 
     * @return int defensa del componente.
     */
    @Override
    public int defence() {
        return 24;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return int Velocidad del componente.
     */
    @Override
    public int speed() {
        return 11;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return int Peso del componente.
     */
    @Override
    public int weight() {
        return 789;
    }
}