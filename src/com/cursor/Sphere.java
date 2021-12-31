package com.cursor;

public class Sphere extends SpaceShape {

    private final double radius = 20.0;

    public Sphere(int xa, int xb, int ya, int yb, int za, int zb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
        this.za = za;
        this.zb = zb;
    }

    @Override
    public double getArea() {
        return 4 / 3f * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

  @Override
  public String toString() {
    return "Sphere        | { coordinates" +
            " ( za = " + za +
            ", zb = " + zb +
            "), radius = " + radius +
            ", area = " + getArea() +
            ", volume = " + getVolume() +
            " }";
  }
}
