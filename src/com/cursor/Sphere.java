package com.cursor;

public class Sphere extends SpaceShape {

  public Sphere(int xa, int xb, int ya, int yb, int za, int zb) {

    this.xa = xa;
    this.xb = xb;
    this.ya = ya;
    this.yb = yb;
    this.za = za;
    this.zb = zb;
  }

  @Override
  public String toString() {
    return "Sphere { " +
            "za = " + za +
            ", zb = " + zb +
            ", area = " + getArea() +
            ", volume = " + getVolume() +
            " }";
  }

  // V_volume = 4/3 π r³
    // S_area = 4πR2


  @Override
  public double getArea() {
    return 4/3f*Math.PI * Math.pow(getRadius(),3);
  }

  @Override
  public double getVolume() {
    return 4 * Math.PI * Math.pow(getRadius(),2);
  }
}
