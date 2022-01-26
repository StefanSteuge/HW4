package com.cursor;

public class Rectangle extends PlaneShape {

    public Rectangle(int Ax, int Bx, int Ay, int By) {

        this.Ax = Ax;
        this.Bx = Bx;
        this.Ay = Ay;
        this.By = By;
    }

    @Override
    public double getArea() {
        return size_A * size_B;
    }

    @Override
    public double getPerimeter() {
        return 2 * (size_A + size_B);
    }

    @Override
    public String toString() {
        return "Rectangle     | { coordinates" +
                " ( Ax = " + Ax +
                ", Bx = " + Bx +
                ", Ay = " + Ay +
                ", By = " + By +
                "), area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                " }";
    }
}