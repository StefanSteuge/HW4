package com.cursor;

public class Circle extends PlaneShape {

    private final double radius = 15;

    public Circle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle        | { coordinates " +
                "( xa = " + xa +
                ", ya = " + ya +
                "), radius = " + radius +
                ", area = " + getArea() +
                ", perimrter = " + getPerimeter() +
                " }";
    }

}
