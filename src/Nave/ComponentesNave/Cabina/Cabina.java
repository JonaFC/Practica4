package Nave.ComponentesNave.Cabina;

import Nave.ComponentesNave.ComponenteNave;

public abstract class Cabina implements ComponenteNave {

  @Override
  public abstract String nombre();

  @Override
  public abstract String descripcion();

  @Override
  public abstract double precio();
}