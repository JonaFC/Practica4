package Nave.ComponentesNave.Cabina;

import Nave.ComponentesNave.ComponenteNave;

public abstract class Cabina implements ComponenteNave {
  /**
   * Regresa el nombre del componente.
   * 
   * @return String Nombre del componente.
   */

  @Override
  public abstract String nombre();

  /**
   * Regresa el descripción del componente.
   * 
   * @return String Descripción del componente.
   */

  @Override
  public abstract String description();

  /**
   * Regresa el precio del componente.
   * 
   * @return double Precio del componente.
   */
  @Override
  public abstract double precio();

  /**
   * Regresa el ataque del componente.
   * 
   * @return int Ataque del componente.
   */
  public abstract int atack();

  /**
   * Regresa el defence del componente.
   * 
   * @return int Defence del componente.
   */
  public abstract int defence();

  /**
   * Regresa el speed del componente.
   * 
   * @return int Speed del componente.
   */
  public abstract int speed();

  /**
   * Regresa el weight del componente.
   * 
   * @return int Weight del componente.
   */
  public abstract int weight();

}