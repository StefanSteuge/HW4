package com.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public double getDistSpace() {
        return Math.sqrt(Math.pow(xa - xb,2)  + Math.pow(ya - yb,2) + Math.pow(za - zb,2));
    }
}


