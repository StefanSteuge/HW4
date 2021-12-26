package com.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable,VolumeMeasurable {


    public SpaceShape(int x, int y, int z) {
        super(x, y, z);
    }
}
