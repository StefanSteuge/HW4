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
// S_area = 6S2
    // V_volume =S3


    @Override
    public String toString() {
        return "Cuboid { " +
                "xa = " + xa +
                ", xb = " + xb +
                ", ya = " + ya +
                ", yb = " + yb +
                ", za = " + za +
                ", zb = " + zb +
                ", area = " + getArea() +
                ", volume = " + getVolume() +
                " }";
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getDepth(),2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getDepth(),3);
    }
}