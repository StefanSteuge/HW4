package com.cursor;

public class Triangle extends PlaneShape {
    public Triangle() {
    }

    public Triangle(int xa, int xb, int ya, int yb, int za, int zb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
        this.za = za;
        this.zb = zb;
    }

    @Override
    public double getArea() {
        return getDistPlane() + getDistPlane() + getDistPlane();
    }

    @Override
    public double getPerimeter() {
        return getDistPlane() * getDistPlane();
    }

    @Override
    public String toString() {
        return "Triangle      | { coordinates" +
                " ( xa = " + xa +
                ", xb = " + xb +
                ", ya = " + ya +
                ", yb = " + yb +
                "), area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                " }";
    }
}