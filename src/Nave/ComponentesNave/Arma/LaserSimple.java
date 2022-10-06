package Nave.ComponentesNave.Arma;

public class LaserSimple extends Arma {
    /**
     * Regresa el nombre del componente.
     * 
     * @return String Nombre del componente.
     */
    @Override
    public String nombre() {
        return "Láser Simple.";
    }

    /**
     * Regresa el descripción del componente.
     * 
     * @return String Descripción del componente.
     */
    @Override
    public String description() {
        return "Puede matar a 1 persona.";
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return double Precio del componente.
     */
    @Override
    public double precio() {
        return 25000.;
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return int Ataque del componente.
     */
    @Override
    public int atack() {
        return 1;
    }

    /**
     * Regresa el Defensa del componente.
     * 
     * @return int defensa del componente.
     */
    @Override
    public int defence() {
        return 809;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return int Velocidad del componente.
     */
    @Override
    public int speed() {
        return 22;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return int Peso del componente.
     */
    @Override
    public int weight() {
        return 33;
    }
}