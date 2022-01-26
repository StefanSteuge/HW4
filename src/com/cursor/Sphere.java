package com.cursor;

public class Sphere extends SpaceShape {

    private final double radius = 20.0;

    public Sphere(int Ax, int Bx, int Ay, int By, int Cx, int Cy) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
        this.Cx = Cx;
        this.Cy = Cy;
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
                " ( Ax = " + Ax +
                ", Bx = " + Bx +
                "), radius = " + radius +
                ", area = " + getArea() +
                ", volume = " + getVolume() +
                " }";
    }
}