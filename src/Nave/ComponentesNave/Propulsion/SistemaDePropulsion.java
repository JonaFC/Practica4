package Nave.ComponentesNave.Propulsion;

import Nave.ComponentesNave.ComponenteNave;

public abstract class SistemaDePropulsion implements ComponenteNave {

  @Override
  public abstract String nombre();

  @Override
  public abstract String descripcion();

  @Override
  public abstract double precio();
}