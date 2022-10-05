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
}