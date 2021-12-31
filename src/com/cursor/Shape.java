package com.cursor;

public abstract class Shape {
    double a = getDistPlane();
    double b = getDistSpace();
    int xa;
    int xb;
    int ya;
    int yb;
    int za;
    int zb;

    public double getDistPlane(){
        return a;
    }

    public double getDistSpace() {
        return b;
    }
}
