package com.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    double size_A = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2) + Math.pow(Cx - Cy, 2));
    double size_B = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2) + Math.pow(Cx - Cy, 2));
    double size_C = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2) + Math.pow(Cx - Cy, 2));


}