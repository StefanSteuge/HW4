package com.cursor;

public class Triangle extends PlaneShape {
    private double perimeter;
    private double hlPerim;
    private double area;

    public Triangle(int Ax, int Bx, int Ay, int By, int Cx, int Cy) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
        this.Cx = Cx;
        this.Cy = Cy;
    }

    @Override
    public double getPerimeter() {
        perimeter = size_A + size_B + size_C;
        return perimeter;
    }

    @Override
    public double getArea() {
        hlPerim = perimeter / 2;
        area = Math.sqrt(hlPerim * (hlPerim - size_A) * (hlPerim - size_B) * (hlPerim - size_C));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle      | { coordinates" +
                " ( Ax =" + Ax +
                ", Bx =" + Bx +
                ", Ay =" + Ay +
                ", By =" + By +
                "), area = " + area +
                ", perimeter = " + perimeter +
                " }";
    }
}