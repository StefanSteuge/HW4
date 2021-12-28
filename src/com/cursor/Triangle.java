package com.cursor;

public class Triangle extends PlaneShape {

    public Triangle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    // P_perimeter = A+B+H
    // S_area = A*H


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

    @Override
    public double getArea() {
        return getA()+getB()+getHeight();
    }

    @Override
    public double getPerimeter() {
        return getA()*getHeight();
    }
}