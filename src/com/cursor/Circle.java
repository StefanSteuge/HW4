package com.cursor;

public class Circle extends Shape{
    private int vertex1;
    private double radius;

    public Circle(int x, int y) {
        super(x, y);
    }

    public int getVertex1() {
        return vertex1;
    }

    public void setVertex1(int vertex1) {
        this.vertex1 = vertex1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
