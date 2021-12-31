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

    @Override
    public double getArea() {
        return Math.pow(b, 2) + 4 * (b * b / 2);
    }

    @Override
    public double getVolume() {
        return 1 / 3f * b * b * b;
    }

    @Override
    public String toString() {
        return "SquarePyramid | { coordinates" +
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
