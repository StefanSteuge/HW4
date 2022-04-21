package com.cursor;

public abstract class Shape {

    double size_A;
    double size_B;
    double size_C;
    double Ax;
    double Bx;
    double Ay;
    double By;
    double Cx;
    double Cy;

    public Shape(double size_A, double size_B, double size_C) {
        this.size_A = size_A;
        this.size_B = size_B;
        this.size_C = size_C;
    }

    public Shape() {
    }

    public double getSize_A() {
        return size_A;
    }

    public double getSize_B() {
        return size_B;
    }

    public double getSize_C() {
        return size_C;
    }

    public double getAx() {
        return Ax;
    }

    public double getBx() {
        return Bx;
    }

    public double getAy() {
        return Ay;
    }

    public double getBy() {
        return By;
    }

    public double getCx() {
        return Cx;
    }

    public double getCy() {
        return Cy;
    }

    public Shape(double size_A, double size_B) {
        this.size_A = size_A;
        this.size_B = size_B;
    }
}