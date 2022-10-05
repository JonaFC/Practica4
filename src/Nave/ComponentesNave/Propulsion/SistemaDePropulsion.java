package Nave.ComponentesNave.Propulsion;

import Nave.ComponentesNave.ComponenteNave;

public abstract class SistemaDePropulsion implements ComponenteNave {

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
}