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

    public Shape(double size_A, double size_B) {
        this.size_A = size_A;
        this.size_B = size_B;
    }


}
