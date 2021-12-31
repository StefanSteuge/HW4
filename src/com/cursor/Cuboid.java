package com.cursor;

public class Cuboid extends SpaceShape {

    public Cuboid(int xa, int xb, int ya, int yb, int za, int zb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
        this.za = za;
        this.zb = zb;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getDistSpace(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getDistSpace(), 3);
    }

    @Override
    public String toString() {
        return "Cuboid        | { coordinates" +
                " ( xa = " + xa +
                ", xb = " + xb +
                ", ya = " + ya +
                ", yb = " + yb +
                ", za = " + za +
                ", zb = " + zb +
                "), area = " + getArea() +
                ", volume = " + getVolume() +
                " }";
    }
}