package com.cursor;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public double getDistPlane() {
        return Math.sqrt(Math.pow(xa - xb,2)  + Math.pow(ya - yb,2));
    }
}


