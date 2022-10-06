package Nave.ComponentesNave.Blindaje;

public class BlindajeSimple extends Blindaje {
    /**
     * Regresa el nombre del componente.
     * 
     * @return String Nombre del componente.
     */
    @Override
    public String nombre() {
        return "Blindaje Simple.";
    }

    /**
     * Regresa el descripción del componente.
     * 
     * @return String Descripción del componente.
     */
    @Override
    public String description() {
        return "Solo resiste ataques de láser simple.";
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return double Precio del componente.
     */
    @Override
    public double precio() {
        return 5000.;
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return int Ataque del componente.
     */
    @Override
    public int atack() {
        return 78;
    }

    /**
     * Regresa el Defensa del componente.
     * 
     * @return int defensa del componente.
     */
    @Override
    public int defence() {
        return 98;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return int Velocidad del componente.
     */
    @Override
    public int speed() {
        return 23;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return int Peso del componente.
     */
    @Override
    public int weight() {
        return 45;
    }
}