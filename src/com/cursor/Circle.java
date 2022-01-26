package com.cursor;

public class Circle extends PlaneShape {

    private final double radius = 15;

    public Circle(int Ax, int Bx, int Ay, int By) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
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
                "( Ax = " + Ax +
                ", Bx = " + Bx +
                "), radius = " + radius +
                ", area = " + getArea() +
                ", perimrter = " + getPerimeter() +
                " }";
    }
}