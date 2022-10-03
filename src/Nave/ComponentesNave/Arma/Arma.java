package Nave.ComponentesNave.Arma;

import Nave.ComponentesNave.ComponenteNave;

public abstract class Arma implements ComponenteNave {

  @Override
  public abstract String nombre();

  @Override
  public abstract String descripcion();

  @Override
  public abstract double precio();
}