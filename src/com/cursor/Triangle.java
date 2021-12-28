package com.cursor;

public class Triangle extends PlaneShape {

    public Triangle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    @Override
    public double getArea() {
        return getA() + getB() + getHeight();
    }

    @Override
    public double getPerimeter() {
        return getA() * getHeight();
    }

    @Override
    public String toString() {
        return "Triangle { " +
                "xa = " + xa +
                ", xb = " + xb +
                ", ya = " + ya +
                ", yb = " + yb +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                " }";
    }
}