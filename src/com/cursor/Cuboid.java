package com.cursor;

public class Cuboid extends SpaceShape {
    double area;
    double volume;

    public Cuboid(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    public Cuboid(int Ax, int Bx, int Ay, int By, int Cx, int Cy) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
        this.Cx = Cx;
        this.Cy = Cy;
    }

    @Override
    public double getArea() {
        return area = 6 * Math.pow(getSize_B(), 2);
    }

    @Override
    public double getVolume() {
        return volume = Math.pow(getSize_B(), 3);
    }

    @Override
    public String toString() {
        return "Cuboid        | { coordinates" +
                " ( Ax = " + Ax +
                ", Bx = " + Bx +
                ", Ay = " + Ay +
                ", By = " + By +
                ", Cx = " + Cx +
                ", Cy = " + Cy +
                "), area = " + area +
                ", volume = " + volume +
                " }";
    }
}