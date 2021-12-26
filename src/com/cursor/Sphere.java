package com.cursor;

public class Sphere extends Shape {
    private int vertex;
    private double radius;

    public Sphere(int x, int y, int z) {
        super(x, y, z);
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
