package com.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public double getDistSpace() {
        return Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb) + (za - zb) * (za - zb));
    }
}


