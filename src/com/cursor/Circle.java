package com.cursor;

public class Circle extends PlaneShape{

    public Circle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

       // P_perimeter = 2*3.14*R
    // S_area = 3,14*R2


    @Override
    public String toString() {
        return "Circle { " +
                "xa = " + xa +
                ", ya = " + ya +
                ", area = " + getArea() +
                ", perimrter = " + getPerimeter() +
                " }";
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(getRadius(),2);
    }

}
