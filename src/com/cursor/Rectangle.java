package com.cursor;

public class Rectangle extends PlaneShape {

    public Rectangle(int xa, int xb, int ya, int yb) {

        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    @Override
    public double getArea() {
        return getDistPlane() * getDistPlane();
    }


    @Override
    public double getPerimeter() {
        return 2 * (getDistPlane() + getDistPlane());
    }

    @Override
    public String toString() {
        return "Rectangle     | { coordinates" +
                " ( xa = " + xa +
                ", xb = " + xb +
                ", ya = " + ya +
                ", yb = " + yb +
                "), area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                " }";
    }
}
