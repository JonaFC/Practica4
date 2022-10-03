package Nave.ComponentesNave.Blindaje;

import Nave.ComponentesNave.ComponenteNave;

public abstract class Blindaje implements ComponenteNave {

  @Override
  public abstract String nombre();

  @Override
  public abstract String descripcion();

  @Override
  public abstract double precio();
}