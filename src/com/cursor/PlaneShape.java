package com.cursor;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public double getDistPlane() {
        return Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
    }

}


