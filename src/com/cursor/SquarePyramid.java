package com.cursor;

public class SquarePyramid extends SpaceShape {

    public SquarePyramid(int Ax, int Bx, int Ay, int By, int Cx, int Cy) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
        this.Cx = Cx;
        this.Cy = Cy;
    }

    @Override
    public double getArea() {
        return Math.pow(size_B, 2) + 4 * (size_A * size_B / 2);
    }

    @Override
    public double getVolume() {
        return 1 / 3f * size_A * size_B * size_C;
    }

    @Override
    public String toString() {
        return "SquarePyramid | { coordinates" +
                " ( Ax = " + Ax +
                ", Bx = " + Bx +
                ", Ay = " + Ay +
                ", By = " + By +
                ", Cx = " + Cx +
                ", Cy = " + Cy +
                "), area = " + getArea() +
                ", volume = " + getVolume() +
                " }";
    }
}
