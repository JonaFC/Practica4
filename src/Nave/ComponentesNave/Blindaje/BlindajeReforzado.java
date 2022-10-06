package Nave.ComponentesNave.Blindaje;

public class BlindajeReforzado extends Blindaje {
    /**
     * Regresa el nombre del componente.
     * 
     * @return String Nombre del componente.
     */
    @Override
    public String nombre() {
        return "Blindaje Reforzado.";
    }

    /**
     * Regresa el descripción del componente.
     * 
     * @return String Descripción del componente.
     */
    @Override
    public String description() {
        return "Resiste ataques de láser simple y 1 misil de plasma.";
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return double Precio del componente.
     */
    @Override
    public double precio() {
        return 15000.;
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return int Ataque del componente.
     */
    @Override
    public int atack() {
        return 7;
    }

    /**
     * Regresa el Defensa del componente.
     * 
     * @return int defensa del componente.
     */
    @Override
    public int defence() {
        return 90;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return int Velocidad del componente.
     */
    @Override
    public int speed() {
        return 456;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return int Peso del componente.
     */
    @Override
    public int weight() {
        return 23;
    }
}