package com.cursor;

public class SquarePyramid extends SpaceShape {

    public SquarePyramid(int xa, int xb, int ya, int yb, int za, int zb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
        this.za = za;
        this.zb = zb;
    }
    // S_area = a*a+4(a*b/2)
    // V_volume = 1/3*a*b*h


    @Override
    public String toString() {
        return "SquarePyramid { " +
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
        return Math.pow(getWidth(),2) + 4 * (getDepth()*getHeight()/2);
    }

    @Override
    public double getVolume() {
        return 1 / 3f * getWidth() * getDepth() * getHeight();
    }
}
