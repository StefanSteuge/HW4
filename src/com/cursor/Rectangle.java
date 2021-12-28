package com.cursor;

public class Rectangle extends PlaneShape {

    public Rectangle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

        // P_perimeter = (a+b)*2
        // S_area      =  a*h


    @Override
    public String toString() {
        return "Rectangle { " +
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
    return getA() * getHeight();
    }


    @Override
    public double getPerimeter() {
       return 2*(getA() + getB());
            }
}
