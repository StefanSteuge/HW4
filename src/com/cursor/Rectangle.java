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
        return a * a;
    }


    @Override
    public double getPerimeter() {
        return 2 * (a + a);
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
