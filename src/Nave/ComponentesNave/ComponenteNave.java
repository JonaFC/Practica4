package Nave.ComponentesNave;

public interface ComponenteNave {
    /**
     * Regresa el nombre del componente.
     * 
     * @return String Nombre del componente.
     */
    String nombre();

    /**
     * Regresa el descripción del componente.
     * 
     * @return String Descripción del componente.
     */
    String description();

    /**
     * Regresa el precio del componente.
     * 
     * @return double Precio del componente.
     */
    double precio();

    /**
     * Regresa el ataque del componente.
     * 
     * @return int Ataque del componente.
     */
    int atack();

    /**
     * Regresa el defence del componente.
     * 
     * @return int Defence del componente.
     */
    int defence();

    /**
     * Regresa el speed del componente.
     * 
     * @return int Speed del componente.
     */
    int speed();

    /**
     * Regresa el weight del componente.
     * 
     * @return int Weight del componente.
     */
    int weight();
}